package leon.sms.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leon.sms.mapper.ActionForDayMapper;
import leon.sms.mapper.GoodsMapper;
import leon.sms.mapper.UserMapper;
import leon.sms.pojo.ActionForDay;
import leon.sms.pojo.Goods;
import leon.sms.pojo.Project;
import leon.sms.pojo.User;

/** 
* @author Leon
* @date 创建时间：2018年5月3日 下午4:27:46
* @version 1.0
* 类说明 :
* 
*/
@Service
public class DocumentaryService
{
	@Autowired
	GoodsMapper goodsMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	ActionForDayMapper actionForDayMapper;
	
	public void change(Project project)
	{
		Goods goods = goodsMapper.get(project.getGoodsName());
		
		if(project.getState().equals("已发货"))
		{
			System.out.println("货物减少了");
			goods.setNumber(goods.getNumber()-project.getGoodsNumber());
			goodsMapper.updateNum(goods);
		}
		if(project.getState().equals("已取消"))
		{
			System.out.println("货物增加了");
			goods.setNumber(goods.getNumber()+project.getGoodsNumber());
			goodsMapper.updateNum(goods);
		}
		if(project.getState().equals("已完成"))
		{
			User user = userMapper.get(project.getStaffName());
			user.setProjectsNum(user.getProjectsNum()+1);
			userMapper.update(user);
		}
		
		/**
		 * 统计每日跟单次数
		 */
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		// System.out.println("今日日期：" + dateNowStr);
		ActionForDay foo = actionForDayMapper.get(java.sql.Date.valueOf(date));
		if (foo != null)
		{
			foo.setNumber(foo.getNumber() + 1);
			actionForDayMapper.update(foo);
		}
		else
		{
			ActionForDay tmp = new ActionForDay(java.sql.Date.valueOf(date),1);
			actionForDayMapper.add(tmp);
		}
	}
	
}

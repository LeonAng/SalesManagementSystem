package leon.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leon.sms.mapper.GoodsMapper;
import leon.sms.pojo.Goods;
import leon.sms.pojo.Project;

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
	
	public void changeGoodsNum(Project project)
	{
		Goods goods = goodsMapper.get(project.getGoodsName());
		
		if(project.getState().equals("已发货"))
		{
			System.out.println("货物减少了");
			goods.setNumber(goods.getNumber()-project.getGoodsNumber());
			goodsMapper.update(goods);
		}
		if(project.getState().equals("已取消"))
		{
			System.out.println("货物增加了");
			goods.setNumber(goods.getNumber()+project.getGoodsNumber());
			goodsMapper.update(goods);
		}
	}
	
}

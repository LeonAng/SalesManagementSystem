package leon.sms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.mapper.ActionForDayMapper;
import leon.sms.mapper.GoodsMapper;
import leon.sms.mapper.UserMapper;
import leon.sms.pojo.ActionForDay;
import leon.sms.pojo.Goods;
import leon.sms.pojo.User;

/** 
* @author Leon
* @date 创建时间：2018年5月4日 上午11:34:54
* @version 1.0
* 类说明 :
* 
*/
@Controller
@RequestMapping("")
public class AnalysisController
{
	@Autowired
	GoodsMapper goodsMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	ActionForDayMapper actionForDayMapper;
	
	@RequestMapping("analysis")
	public ModelAndView analysis()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/analysis");

		List<Goods> goodsList = goodsMapper.list();
		List<User> userList = userMapper.list();
		List<ActionForDay> list = actionForDayMapper.list();
		List<ActionForDay> actionForDayList = new ArrayList<ActionForDay>();
		for(int i = list.size()-7;i<=list.size()-1;i++)
		{
			actionForDayList.add(list.get(i));
		}
		
		mav.addObject("goodsList", goodsList);
		mav.addObject("userList", userList);
		mav.addObject("actionForDayList", actionForDayList);
		return mav;
	}
	
}

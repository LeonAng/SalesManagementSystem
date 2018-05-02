package leon.sms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.pojo.User;

/** 
* @author Leon
* @date 创建时间：2018年4月6日 下午3:21:04
* @version 1.0
* 类说明 :
* 
*/
@Controller
@RequestMapping("")
public class HomeController
{
	@RequestMapping("homeTitle")
	public ModelAndView homeTitle()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/title");
		return mav;
	}
	
	@RequestMapping("homeLeft")
	public ModelAndView homeLeft(HttpSession httpSession)
	{
		ModelAndView mav = new ModelAndView();
		
		User user = (User) httpSession.getAttribute("user");
		if(user.isAdmin())//销售经理
		{
			mav.setViewName("home/adminLeft");
		}
		else//普通员工
		{
			mav.setViewName("home/staffLeft");
		}
		return mav;
	}
	
	@RequestMapping("homeMain")
	public ModelAndView homeMain()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/main");
		return mav;
	}
}

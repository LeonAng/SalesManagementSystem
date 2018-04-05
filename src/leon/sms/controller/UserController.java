package leon.sms.controller;

import java.util.List;

/** 
* @author Leon
* @date 创建时间：2018年4月5日 下午4:00:38
* @version 1.0
* 类说明 :
* 
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.pojo.User;
import leon.sms.service.UserService;

@Controller
@RequestMapping("")
public class UserController
{
	@Autowired
	UserService userService;

	@RequestMapping("listusers")
	public ModelAndView listUser()
	{
		ModelAndView mav = new ModelAndView();
		List<User> users = userService.list();

		
		// 放入转发参数
		mav.addObject("users", users);
		// 放入jsp路径
		mav.setViewName("showUsers");
		return mav;
	}
}

package leon.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.pojo.User;
import leon.sms.service.UserService;

/** 
* @author Leon
* @date 创建时间：2018年4月6日 下午12:45:38
* @version 1.0
* 类说明 :
* 
*/
@Controller
@RequestMapping("")
public class UserController
{
	@Autowired
	UserService userService;
	
	@RequestMapping("login")
	public ModelAndView loginUser(@RequestParam("name")String name,  
            @RequestParam("password")String password, HttpSession httpSession)
	{
		User user= new User(name,password);
		ModelAndView mav = new ModelAndView();
		if(userService.search(user))
		{
			//将数据存储到session中
			httpSession.setAttribute("user",user);
			
			System.out.println(user.toString());
			mav.setViewName("home/fmain");
			return mav;
		}
		
		mav.setViewName("user/loginFailure");
		return mav;
	}
	
	@RequestMapping("registe")
	public ModelAndView registeUser(@RequestParam("name")String name,  
            @RequestParam("password")String passWord,@RequestParam("identity")String identity)
	{
		boolean isAdmin = false;
		if("manager".equals(identity))
		{
			isAdmin=true;
		}
		User user= new User(name,passWord,isAdmin);
		ModelAndView mav = new ModelAndView();
		
		if(userService.addUser(user))
		{
			System.out.println("注册成功");
		}
		else
		{
			System.out.println("注册失败");
		}
		mav.setViewName("user/loginFailure");
		return mav;
	}
	
	@RequestMapping("logout")
	public ModelAndView logout(HttpSession httpSession,HttpServletResponse response, HttpServletRequest request) 
			throws ServletException, IOException
	{
		System.out.println("触发注销功能");
		
		httpSession.invalidate();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/logout");
		return mav;
	}
}

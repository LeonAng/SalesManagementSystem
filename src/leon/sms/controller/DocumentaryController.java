package leon.sms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/** 
* @author Leon
* @date 创建时间：2018年5月2日 下午6:25:02
* @version 1.0
* 类说明 :
* 
*/
@Controller
@RequestMapping("")
public class DocumentaryController
{
	@RequestMapping("changeProject")
	public ModelAndView changeProject(@RequestParam("name")String name,@RequestParam("id")String id)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/loginFailure");
		System.out.println(name + " "+ id);
		return mav;
	}
}

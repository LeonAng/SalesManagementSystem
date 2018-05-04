package leon.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.mapper.ProjectMapper;
import leon.sms.pojo.Project;

/** 
* @author Leon
* @date 创建时间：2018年5月4日 上午10:56:58
* @version 1.0
* 类说明 :
* 
*/
@Controller
@RequestMapping("")
public class ClientController
{
	@Autowired
	ProjectMapper projectMapper;
	
	@RequestMapping("findProjectByClient")
	public ModelAndView findProjectByClient(@RequestParam("clientName") String clientName)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/others");
		
		List<Project> list = projectMapper.findProjects(clientName);
		mav.addObject("list", list);
		return mav;
	}
}

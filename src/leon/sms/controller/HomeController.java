package leon.sms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.mapper.InstructionMapper;
import leon.sms.pojo.Instruction;
import leon.sms.pojo.Project;
import leon.sms.pojo.User;
import leon.sms.service.ProjectService;

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
	@Autowired
	ProjectService projectService;
	@Autowired
	InstructionMapper instructionMapper;
	
	@RequestMapping("homeTitle")
	public ModelAndView homeTitle()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("top");
		return mav;
	}
	
	@RequestMapping("homeLeft")
	public ModelAndView homeLeft(HttpSession httpSession)
	{
		ModelAndView mav = new ModelAndView();
		
		User user = (User) httpSession.getAttribute("user");
		if(user.isAdmin())//销售经理
		{
			System.out.println("此人是销售经理");
			mav.setViewName("home/adminLeft");
		}
		else//普通员工
		{
			System.out.println("此人是销售员工");
			mav.setViewName("home/staffLeft");
		}
		return mav;
	}
	
	@RequestMapping("homeMain")
	public ModelAndView homeMain()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/culture");
		return mav;
	}
	
	@RequestMapping("staffDocumentary")
	public ModelAndView staffDocumentary(HttpSession httpSession)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/staffDocumentary");
		
		User user = (User) httpSession.getAttribute("user");
		List<Project> list = projectService.searchByName(user.getName());
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("instructions")
	public ModelAndView instructions(HttpSession httpSession)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/instructions");
		List<Instruction> list = instructionMapper.list(((User)httpSession.getAttribute("user")).getName());
		mav.addObject("list", list);
		
		return mav;
	}
	
	@RequestMapping("analysis")
	public ModelAndView analysis()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/analysis");
		return mav;
	}
	
	@RequestMapping("adminDocumentary")
	public ModelAndView adminDocumentary()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/adminDocumentary");
		mav.addObject("list", projectService.getAll());
		return mav;
	}
	
	@RequestMapping("others")
	public ModelAndView clientQuery()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/others");
		return mav;
	}
	
	@RequestMapping("addInstruction")
	public ModelAndView addInstruction(@RequestParam("adminName") String managerName,
			@RequestParam("staffName") String staffName, @RequestParam("content") String content)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/adminDocumentary");
		Instruction in = new Instruction( staffName, managerName, content);
		instructionMapper.add(in);
		return mav;
	}
}

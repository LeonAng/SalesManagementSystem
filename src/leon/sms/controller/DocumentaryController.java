package leon.sms.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.mapper.ProjectMapper;
import leon.sms.pojo.Project;
import leon.sms.service.DocumentaryService;

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
	@Autowired
	ProjectMapper projectMapper;
	@Autowired
	DocumentaryService documentaryService;

	@RequestMapping("changeProject")
	public ModelAndView changeProject(@RequestParam("name") String name, @RequestParam("id") String id,
			@RequestParam("staffName") String staffName, @RequestParam("clientName") String clientName,
			@RequestParam("goodsName") String goodsName, @RequestParam("goodsNumber") String goodsNumber,
			@RequestParam("state") String state, @RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("plan") String plan)
			throws UnsupportedEncodingException
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/staffDocumentary");
		
		Project project = new Project(Integer.parseInt(id), name, staffName, clientName, goodsName,
				Integer.parseInt(goodsNumber), state, startDate, endDate, plan);
		synchronized (this)
		{
			projectMapper.update(project);
			System.out.println("sdsd");
			documentaryService.changeGoodsNum(project);
		}
	
		
		return mav;
	}
	
	@RequestMapping("addProject")
	public ModelAndView addProject(@RequestParam("name") String name,
			@RequestParam("staffName") String staffName, @RequestParam("clientName") String clientName,
			@RequestParam("goodsName") String goodsName, @RequestParam("goodsNumber") String goodsNumber,
			@RequestParam("state") String state, @RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("plan") String plan)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/staffDocumentary");

		Project project = new Project( name, staffName, clientName, goodsName,
				Integer.parseInt(goodsNumber), state, startDate, endDate, plan);
		synchronized(this)
		{
			projectMapper.add(project);
			documentaryService.changeGoodsNum(project);
		}
		
		return mav;
	}
	
	@RequestMapping("deleteProject")
	public ModelAndView deleteProject(HttpServletRequest Request)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/staffDocumentary");
		projectMapper.delete(Integer.parseInt((String) Request.getParameter("id")));
		return mav;
	}
}

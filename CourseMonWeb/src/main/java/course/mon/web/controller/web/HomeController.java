package course.mon.web.controller.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import course.mon.web.service.ProductService;


@Controller
public class HomeController {

	@Autowired
	private ProductService service;
	
	@RequestMapping(value = {"/", "", "/index" }, produces="application/x-www-form-urlencoded;charset=UTF-8")
	public String index() {
		return "homePage";
	}
	@RequestMapping(value = "/aboutPage", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView aboutPage() {
		ModelAndView m = new ModelAndView("aboutPage");
		return m;
	}
	
	@RequestMapping(value = "/blogPage", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView blogPage() {
		ModelAndView m = new ModelAndView("blogPage");
		return m;
	}
	
	@RequestMapping(value = "/contactPage", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView contactPage() {
		ModelAndView m = new ModelAndView("contactPage");
		return m;
	}
	
	@RequestMapping(value = "/coursesPage", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView coursesPage() {
		ModelAndView m = new ModelAndView("coursesPage");
		return m;
	}
	
	@RequestMapping(value = "/singlePage", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView singlePage() {
		ModelAndView m = new ModelAndView("singlePage");
		return m;
	}
	
	@RequestMapping(value = "/loginPage", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView loginPage() {
		ModelAndView m = new ModelAndView("loginPage");
		return m;
	}
	
	@RequestMapping(value = "/registrationPage", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView registrationPage() {
		ModelAndView m = new ModelAndView("registrationPage");
		return m;
	}
	

}

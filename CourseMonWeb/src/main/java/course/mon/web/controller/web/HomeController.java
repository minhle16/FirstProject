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

	@RequestMapping(value = "/product", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView products() {
		
		ModelAndView m = new ModelAndView("productListPage");
		m.addObject("msg", "Spring Hello");
				
		m.addObject("msg", "Spring Hello1");
		m.addObject("allProduct", service.getAllProduct());
		return m;
	}

}

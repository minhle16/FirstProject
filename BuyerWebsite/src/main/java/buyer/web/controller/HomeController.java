package buyer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import buyer.web.entitiesvo.TitleVo;
import buyer.web.service.TitleService;

@Controller
public class HomeController {
	@Autowired

	TitleService titleService;

	@RequestMapping(value = { "/index", "/" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView m = new ModelAndView("homePage");
		m.addObject("listTitle", titleService.getTitle());
		m.addObject("title", "Trang chủ");
		return m;
	}
	
	@RequestMapping(value = { "/menProduct" }, method = RequestMethod.GET)
	public ModelAndView showProductMen() {
		ModelAndView m = new ModelAndView("menProduct");

		return m;
	}
	@RequestMapping(value = { "/womenProduct" }, method = RequestMethod.GET)
	public ModelAndView showProductWomen() {
		ModelAndView m = new ModelAndView("womenProduct");
		return m;
	}
	

}

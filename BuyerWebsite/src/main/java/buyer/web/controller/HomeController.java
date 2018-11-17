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
		// System.out.println("HomeCotroller "+titleService.getTitle().size());
		// List<TitleVo> result = titleService.getTitle();
		// for(TitleVo x : result) {
		// System.out.println("x: "+x.getContent());
		// }
		m.addObject("listTitle", titleService.getTitle());
		m.addObject("title", "Trang chủ");
		System.out.println(m.toString());
		return m;
	}
	
	
	/*
	 * public static void main(String[] args) { System.out.println("start"); int
	 * a = titleService.getTitle().size(); System.out.println(a);
	 * System.out.println("done"); }
	 */

}

package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping(value = "/welcome")
	public ModelAndView getMsg() {
		
		ModelAndView view =new ModelAndView();
		
		view.addObject("msg", "Hello Debasish");
		
		view.setViewName("index");
		
		return view;
		
	}
}

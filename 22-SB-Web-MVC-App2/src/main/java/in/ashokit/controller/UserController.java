package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping(value = "/user")
	public ModelAndView getUser() {
		ModelAndView view=new ModelAndView();
		
		view.addObject("name", "Debasish");
		
		view.addObject("email", "debasish@gmail.com");
		
		view.addObject("phno", "+91 9846516161");
		
		view.setViewName("index");
		return view;
	}
	
	//OR
	
	@GetMapping(value = "/userdetails")
	public String getUserDetails(Model model) {
		
		model.addAttribute("name", "Dev");
		
		model.addAttribute("email", "dev@gmail.com");
		
		model.addAttribute("phno", "+91 9846516161");
		
		return "index";
	}
}

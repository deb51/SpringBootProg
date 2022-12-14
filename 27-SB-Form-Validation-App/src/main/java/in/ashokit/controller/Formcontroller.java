package in.ashokit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Form;

@Controller
public class Formcontroller {

	@GetMapping(value = "/form")
	public String loadForm(Model model) {
		Form userForm = new Form();
		
		model.addAttribute("user", userForm);
		
		return "indexform";
	}
	
	@PostMapping(value = "save")
	public String saveSucessful(@Valid @ModelAttribute("user") Form user,BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			return "indexform";
		}
		
		System.out.println(user);
		model.addAttribute("msg","Sucessfully Entered");
		return "dashboard";
	}
}

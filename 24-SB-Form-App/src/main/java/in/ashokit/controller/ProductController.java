package in.ashokit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping(value = { "/loadform", "/form" })
	public String loadForm() {
		return "index";
	}

	@PostMapping(value = "/save")
	public String handleProduct(Model model, HttpServletRequest req) {
		model.addAttribute("productID",req.getParameter("pid"));
		model.addAttribute("productPrice",req.getParameter("price"));
		model.addAttribute("productName",req.getParameter("pname"));
		return "sucess";
	}
}

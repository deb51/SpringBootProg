package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentrepo;
	
	@GetMapping("/book")
	public String getBook(Model model) {
		Student stuObj = new Student();
		model.addAttribute("stu", stuObj);
		
		return "index";
	}

	@PostMapping("/sucess")
	public String successPage(Student stu) {

		studentrepo.save(stu);
		System.out.println(stu);
		
		return "sucess";
	}

}

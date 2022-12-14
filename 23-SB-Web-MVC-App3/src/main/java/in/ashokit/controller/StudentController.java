package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping(value = "/student")
	public String getStudentDetails(Model model, @RequestParam("sid") Integer student_ID) {

		Student student = studentRepo.getById(student_ID);
		System.out.println(student);
		System.out.println(student.getStudent_ID());
		System.out.println(student.getStudent_Name());
		System.out.println(student.getStudent_Email());
		System.out.println(student.getStudent_age());

		model.addAttribute("stuId", student.getStudent_ID());
		model.addAttribute("stuName", student.getStudent_Name());
		model.addAttribute("stuEmail", student.getStudent_Email());
		model.addAttribute("stuAge", student.getStudent_age());

		System.out.println("Done..");
		return "student";
	}

	@GetMapping(value = "/allstudent")
	public String getStudentDetails(Model model) {

		List<Student> allstudent = studentRepo.findAll();

		model.addAttribute("allstudent", allstudent);
		System.out.println(allstudent);
		System.out.println("Done..");
		return "allstudent";
	}
}

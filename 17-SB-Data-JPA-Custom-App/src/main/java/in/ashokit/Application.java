package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.bindingEntity.Student;
import in.ashokit.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository bean = context.getBean(StudentRepository.class);
	
		//List<Student> students=bean.getStudentByAge(45);
		/*
		 * for(Student student:students) 
		 * {		 * 
		 * System.out.println(student); }
		 */
		
		//bean.deleteStudentByAge(55);
		
		//bean.upDateData("baba", 104);
		
		bean.addData(110, "debasish", "debasish@das.com", 25);
		System.out.println("student updated");
		
	}

}

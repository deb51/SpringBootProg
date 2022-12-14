package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Beans.Student;
import in.ashokit.Repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		Student stu=new Student(103, "bravo", "bravo@gmail", 28);
		
		System.out.println(stu);
		
		
		studentRepository.save(stu);

		System.out.println("Record inserted .....");
	}

}

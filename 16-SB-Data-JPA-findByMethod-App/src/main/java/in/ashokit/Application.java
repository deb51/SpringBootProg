package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.Student;
import in.ashokit.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		//List<Student> studentAge = repository.findByStudentAge(25);
		//List<Student> findByStudentAgeGreaterThanEqual = repository.findByStudentAgeGreaterThanEqual(28);
		List<Student> findByStudentAgeIn = repository.findByStudentAgeIn(Arrays.asList(55,25));
		
		for(Student student:findByStudentAgeIn) {
			System.out.println(student);
		}
		
	}

}

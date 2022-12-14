package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.beans.Student;
import in.ashokit.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		// Iterable<Student> findAll = repository.findAll();
		// System.out.println(findAll);

		// List<Student> students =
		// repository.findAll(Sort.by("studentName").ascending());
		// List<Student> students =
		// repository.findAll(Sort.by("studentName").descending());
		// students.forEach((x)->System.out.println(x));

		/*
		 * Student student = new Student(); student.setstudentAge(25); List<Student>
		 * students = repository.findAll(Example.of(student));
		 * System.out.println(students);
		 */

		int pageNo = 2;
		Page<Student> pageable = repository.findAll(PageRequest.of(pageNo - 1, 3));
		List<Student> students = pageable.getContent();
		//System.out.println(students);

		students.forEach((x)->System.out.println(x));
		System.out.println("Executed...");
	}

}

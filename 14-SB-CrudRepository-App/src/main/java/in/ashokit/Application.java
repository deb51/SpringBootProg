package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Beans.Student;
import in.ashokit.Repository.DBManipulation;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		DBManipulation stu_repo = context.getBean(DBManipulation.class);

		 Student stu1=new Student(104, "baba", "baba@gmail", 25);
		Student stu = new Student(101, "kiwa", "buda@gmail", 55);
		Student stu2 = new Student(106, "priya", "priya@gmail", 25);

		 stu_repo.save(stu);
		 stu_repo.save(stu1);
		 stu_repo.save(stu2);
		 
		// List student_group=Arrays.asList(stu2,stu3);
		// stu_repo.saveAll(student_group);

		// long tableCount=stu_repo.count();
		// System.out.println(tableCount);

		// System.out.println(stu_repo.findById(101));

		// Iterable<Student> students=stu_repo.findAll();

		//List idList = Arrays.asList(102, 101);
		//Iterable<Student> students = stu_repo.findAllById(idList);
		/*
		 * for (Student stu : students) { System.out.println(stu); }
		 */

		//stu_repo.deleteById(105);
		
		System.out.println("Data inserted..");
	}

}

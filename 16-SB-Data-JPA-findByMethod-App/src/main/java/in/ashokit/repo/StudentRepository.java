package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByStudentAge(Integer age);
	
	public List<Student> findByStudentAgeGreaterThanEqual(Integer age);
	
	public List<Student> findByStudentAgeIn(List<Integer> Ages);

}

package in.ashokit.Repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.Beans.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}

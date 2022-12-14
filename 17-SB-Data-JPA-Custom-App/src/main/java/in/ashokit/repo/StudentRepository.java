package in.ashokit.repo;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import in.ashokit.bindingEntity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	// SELECT 
	//HQL Query
	/*
	 * @Query(value = "from Student where student_age>=:age") 
	 * public List<Student> getStudentByAge(int age);
	 */
	
	/*
	 * @Query(value = "from Student where student_age=:age") 
	 * public List<Student> getStudentByAge(int age);
	 */
	
	//SQL Query
	/*
	 * @Query(value = "select * from student_dtls",nativeQuery = true) 
	 * public List<Student> getStudentByAge(int age);
	 */
	
	/*
	 * @Query(value = "select * from student_dtls where stu_age=:age",nativeQuery =
	 * true) public List<Student> getStudentByAge(int age);
	 */
	
	// DELETE
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value= "delete from Student where student_age=:age") public void
	 * deleteStudentByAge(int age);
	 */
	
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value= "delete from student_dtls where stu_age=:age" ,nativeQuery =
	 * true) public void deleteStudentByAge(int age);
	 */
	
	//  UPADTE
	
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value = "update Student set student_Name=:name where student_ID=:id")
	 * public void upDateData(@Param("name") String name,@Param("id") int id);
	 */
	
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value =
	 * "update student_dtls set stu_name=:name where stu_id=:id",nativeQuery = true)
	 * public void upDateData(@Param("name") String name,@Param("id") int id);
	 */
	
	// INSERT
	@Modifying
	@Transactional
	@Query(value = "insert into student_dtls values(stu_id-:id,stu_name=:name,stu_age=:age,stu:email=:email)")
	public void addData(@Param("id") int id,@Param("name") String name,@Param("email")String email,@Param("age")int age);
	 
}

package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "student_dtls")
public class Student {

	@Id
	@Column(name = "stu_id")
	private Integer student_ID;
	@Column(name = "stu_name")
	private String student_Name;
	@Column(name = "stu_email")
	private String student_Email;
	@Column(name = "stu_age")
	private Integer student_age;
}

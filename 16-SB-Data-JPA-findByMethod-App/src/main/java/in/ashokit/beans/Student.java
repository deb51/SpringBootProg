package in.ashokit.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "student_dtls")
public class Student {

	@Id
	@Column(name = "stu_id")
	private Integer studentId;
	@Column(name = "stu_name")
	private String studentName;
	@Column(name = "stu_email")
	private String studentEmail;
	@Column(name = "stu_age")
	private Integer studentAge;
}
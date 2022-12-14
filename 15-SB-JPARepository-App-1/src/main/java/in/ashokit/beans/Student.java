package in.ashokit.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_dtls")
public class Student {

	@Id
	@Column(name = "stu_id")
	private Integer studentID;
	@Column(name = "stu_name")
	private String studentName;
	@Column(name = "stu_email")
	private String studentEmail;
	@Column(name = "stu_age")
	private Integer studentAge;

	public Student() {
		super();

	}

	public Student(Integer studentID, String studentName, String studentEmail, Integer studentAge) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAge = studentAge;
	}

	public Integer getstudentID() {
		return studentID;
	}

	public void setstudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getstudentEmail() {
		return studentEmail;
	}

	public void setstudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Integer getstudentAge() {
		return studentAge;
	}

	public void setstudentAge(Integer student_age) {
		this.studentAge = student_age;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + ", student_age=" + studentAge + "]";
	}

}

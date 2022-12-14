package in.ashokit.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
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
		

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(Integer student_ID, String student_Name, String student_Email, Integer student_age) {
			super();
			this.student_ID = student_ID;
			this.student_Name = student_Name;
			this.student_Email = student_Email;
			this.student_age = student_age;
		}

		@Override
		public String toString() {
			return "Student [student_ID=" + student_ID + ", student_Name=" + student_Name + ", student_Email="
					+ student_Email + ", student_age=" + student_age + "]";
		}
}

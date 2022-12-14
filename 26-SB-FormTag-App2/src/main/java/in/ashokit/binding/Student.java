package in.ashokit.binding;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;


import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private Integer studentId;
	
	@Column(name = "STUDENT_NAME")
	private String studntName;
	
	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;
	
	@Column(name = "STUDENT_GENDER")
	private String studentGender;
	
	@Column(name = "PHONE")
	private Long phone;
	
	@Column(name = "COURSE")
	private String course;
	
	@OrderColumn
	@ElementCollection
	@CollectionTable(name = "STUDENT_TIMINGS" , joinColumns=@JoinColumn(name = "STUDENT_ID"))
	@Column(name="TIMINGS")
	private String[] timings;

}

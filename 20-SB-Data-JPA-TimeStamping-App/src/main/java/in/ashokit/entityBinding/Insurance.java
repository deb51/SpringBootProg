package in.ashokit.entityBinding;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "insurance")
public class Insurance {

	@Id
	@GeneratedValue
	@Column(name = "inc_id")
	private Integer insuranceId;
	
	@Column(name ="inc_comp")
	private String insuranceCompany;
	
	@Column(name="inc_amount")
	private String insuranceAmount;
	

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedDate;
	
	
	
}

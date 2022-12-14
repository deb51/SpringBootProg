package in.ashokit.entityBinding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
	

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Insurance(String insuranceCompany, String insuranceAmount) {
		super();
		
		this.insuranceCompany = insuranceCompany;
		this.insuranceAmount = insuranceAmount;
	}
	
	
	
}

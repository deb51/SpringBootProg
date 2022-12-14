package in.ashokit.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Form {

	@NotEmpty(message = "Please Enter Your Name")
	private String name;

	@NotEmpty(message = "Please Enter Your Email")
	@Email(message = "Please Enter valid Email")
	private String email;
	
	@NotNull(message = "Please Enter Your Mobile")
	private Long mobile;

}

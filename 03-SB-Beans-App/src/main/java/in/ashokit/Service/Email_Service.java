package in.ashokit.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import in.nit.PasswordUtil;

@Service
public class Email_Service {

	public Email_Service() {
		System.out.println("---------------------------Email Service @Service Constructor-----------------------------");
	}
	
	@Bean
	public void getService() {
		System.out.println("================Service class method=========================");
	} 
	@Bean
	public void getAnotherService() {
		System.out.println("================Service class  Second method=========================");
	}

}

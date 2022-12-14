package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import in.nit.PasswordUtil;

@Component
public class AppConfig {

	
	public AppConfig() {
		System.out.println("-------------------App config Constructor---------------------");
		
	}
	@Bean
	public PasswordUtil getInstace() {
		return new PasswordUtil();
	}
	@Bean
	public void newInstance() {
		System.out.println(".....................This is a method in AppConfig..............");
	}

}

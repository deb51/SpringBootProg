package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.repo.InsuranceRepository;
import in.ashokit.service.InsuranceService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		 InsuranceService insuranceService = context.getBean(InsuranceService.class);
		
		insuranceService.savePlan();
		
		
		
	}

}

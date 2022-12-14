package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entityBinding.Insurance;
import in.ashokit.repo.InsuranceRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		InsuranceRepository repository = context.getBean(InsuranceRepository.class);
		
		Insurance inc=new Insurance("CHi", "20000");
		repository.save(inc);
		System.out.println("Created...");
	}

}

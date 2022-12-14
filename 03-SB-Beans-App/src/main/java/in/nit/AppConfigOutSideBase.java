package in.nit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigOutSideBase {

	public AppConfigOutSideBase() {
		System.out.println("====================AppConfig Outside base pak. Cons.======================");
	}
	
	@Bean
	public void outSide() {
		System.out.println("-------------------------Outside base pack Methods--------------------------------");
	}

	
}

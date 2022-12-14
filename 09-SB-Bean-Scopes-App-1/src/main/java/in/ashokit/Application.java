package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Beans.Engine;
import in.ashokit.Beans2.Train;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//Engine eng1=context.getBean(Engine.class);
		Train car1=context.getBean(Train.class);
		//System.out.println(eng1);
		//System.out.println(eng2);
	}

}

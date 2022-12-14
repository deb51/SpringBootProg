package in.ashokit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StaticDataFromDB implements CommandLineRunner

//ApplicationRunner
{

	public StaticDataFromDB() {

		System.out.println("+++++++++++++++++StaticDataFromDB :: Constructor++++++++++++++++");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Commandline Runner");
		
	}
	
	

}

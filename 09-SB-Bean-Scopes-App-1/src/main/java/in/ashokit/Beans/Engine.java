package in.ashokit.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import in.ashokit.Beans2.Train;

@Component
@Scope("prototype")
public class Engine {
	
	

	public Engine() {
		System.out.println("Engine class Const");
	}

	
}

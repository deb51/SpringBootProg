package in.ashokit.Beans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import in.ashokit.Beans.Engine;

@Component
@Scope("prototype")
public class Train {

	@Autowired
	private Engine eng1;
	
	@Autowired
	private Engine eng2;
	
	@Autowired
	private Engine eng3;

	public Train() {
		System.out.println("Train class constructor");
	}

}

package in.ashokit.car;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("++++++++++++++++Engine Constructor+++++++++++++++");
	}
	public int start() {
		return 0;
	}
}

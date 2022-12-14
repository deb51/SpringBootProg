package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaySlipGenerator {

	//@Autowired
	private Printer printer;

	public PaySlipGenerator() {
		System.out.println("++++++++++++++++++ PaySlip Constructor ++++++++++++++++");
	}
	// When there is more than one  constructor that time we have to use @AutoWire 

	// @Autowired
	public PaySlipGenerator(Printer printer) {
		System.out.println("++++++++++++++++++ PaySlip Parameter Constructor Const Injection ++++++++++++++++");
		this.printer = printer;
	}

	public void generatePaySlip() {
		printer.printPS();
	}
}

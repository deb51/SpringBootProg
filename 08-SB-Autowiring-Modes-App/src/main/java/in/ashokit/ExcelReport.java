package in.ashokit;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("excel")
//@Component("reportGenerator")
//@Primary
public class ExcelReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("===========Excel Report Generated============");
		
	}

	
}

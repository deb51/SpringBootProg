package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ConnectionPoolManager implements InitializingBean,DisposableBean{
	
	
	
	public ConnectionPoolManager() {
		System.out.println("++++++++++Connection Pool Manager Constructor++++++++++");
	}

	public void getConnection() {
		System.out.println("+++++++++++++Got connection from pool+++++++++++");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("+++++++++++Connection pool after Properties method++++++++++++");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("+++++++Connection pool destroy method+++++++++");
		
	}

}

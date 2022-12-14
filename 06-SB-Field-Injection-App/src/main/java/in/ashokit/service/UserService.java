package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDAO;

@Service
public class UserService {

	public UserService() {
		
		System.out.println("+++++++++++++++++ User Service === constructor ++++++++++++++++++++++");
	}

	@Autowired
	private UserDAO userDao;
	
	public void saveUser() {
		String status=userDao.saveUser("Raju","raju@gmail.com",54984949);
		System.out.println(status);
	}
}

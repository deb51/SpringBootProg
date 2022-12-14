package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	public UserDAO() {
		System.out.println("+++++++++++++++++++ USer DAO === Constructor+++++++++++++++++++++");
	}

	public String saveUser(String name, String Email, long num) {
		return "User Saved";

	}

}

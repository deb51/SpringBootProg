package in.ashokit;

import java.lang.reflect.Field;

public class ReflectionDemo {

	public static void main(String[] args)  {

		try {
			
		
		Class<?> clazz = Class.forName("in.ashokit.Student");

		Object obj = clazz.newInstance();

		Field ageField = clazz.getDeclaredField("stuID");

		ageField.setAccessible(true);
		
		ageField.set(obj, 20);
		
		System.out.println(ageField.get(obj));
		
		}catch (Exception e) {
		e.printStackTrace();
		}

	}
}

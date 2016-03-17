package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.jbc.service.IUserService;

public class TestAction {
	@Test
	public void test() {

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml", "classpath:spring-hibernate.xml" });
		IUserService userService = (IUserService) ac.getBean("userService");
		try {
			System.out.println(userService.findAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

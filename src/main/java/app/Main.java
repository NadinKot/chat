package app;

import app.model.UserAuth;
import app.model.Users;
import app.service.interfaces.UserService;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Main {

	public static void main(String[] args) {

		ApplicationContext  context = new ClassPathXmlApplicationContext ("spring-config.xml");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");

		/*UserAuthDAO userAuthDAO =  (UserAuthDAO) context.getBean("userAuthDAO");
		UsersDAO usersDAO = (UsersDAO) context.getBean("usersDAO");*/

		UserService userService = (UserService) context.getBean("userService");
		//Users user = userService.findUserById(168);
		/*userService.deleteUser(user);*/

		//UserAuth auth = new UserAuth("User3","User3");
		//Users user = new Users("name3","surname3","3user@mail1.ru","3","female",null,"something about user", auth);
		//userService.saveUser(user);


	}
	}









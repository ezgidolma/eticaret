package eticaret;

import eticaret.business.abstracts.UserService;
import eticaret.business.concretes.ControlManager;
import eticaret.business.concretes.UserManager;
import eticaret.core.abstracts.jGoogleService;
import eticaret.core.concretes.jGoogleManagerAdapter;
import eticaret.dataAccess.concretes.UserDao;
import eticaret.entities.concretes.User;

public class Main {


	public static void main(String[] args) {

		
				User user=new User();
				
				user.setName("ezgi");
				user.setSurname("dolma");
				user.setEmail("ezgidolma23@gmail.com");
				user.setPassword("123456");
				
				System.out.println("----------------------------");
				
				UserService userService=new UserManager(new UserDao(),new ControlManager(),new jGoogleManagerAdapter());
				userService.add(user);
				userService.userLogin(user);
				
				
				

			}

	
	
	
	
	
	
}

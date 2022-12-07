package eticaret.business.concretes;

import eticaret.business.abstracts.UserService;
import eticaret.core.abstracts.jGoogleService;
import eticaret.dataAccess.concretes.UserDao;
import eticaret.entities.concretes.User;

public class UserManager implements UserService{
	UserDao userDao;
	ControlManager controlManager;
	jGoogleService googleService;
	
	public UserManager(UserDao userdao, ControlManager controlmanager, jGoogleService googleservice) {
		super();
		this.userDao = userdao;
		this.controlManager = controlmanager;
		this.googleService = googleservice;
	}

	@Override
	public void add(User user) {
		if(controlManager.emailControl(user)&&controlManager.nameControl(user)&&controlManager.password(user));
		  {
			  userDao.add(user);
			  googleService.addgoogle(user);
			  
		  }
	}

	@Override
	public void userLogin(User user) {
		if(user.getEmail()=="ezgidolma23@gmail.com"&& user.getPassword()=="123456") {
			   userDao.userLogin(user);
			   googleService.userlogingoogle(user);
				  }
				  else {
					  System.out.println("giris yapılamadı");
				  }
	}

}

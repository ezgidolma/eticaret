package eticaret.core.concretes;

import eticaret.core.abstracts.jGoogleService;
import eticaret.entities.concretes.User;
import eticaret.jgoogle.jGoogleManager;

public class jGoogleManagerAdapter implements jGoogleService{

	jGoogleManager googlemanager=new jGoogleManager();
	@Override
	public void addgoogle(User user) {
		System.out.println("Google ile kayıt oluşturuldu "+ user.getName()+user.getSurname());
	}

	@Override
	public void userlogingoogle(User user) {
		System.out.println("Google ile giriş yapıldı. "+ user.getName()+user.getSurname());
		
	}

}

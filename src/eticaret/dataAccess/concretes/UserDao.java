package eticaret.dataAccess.concretes;

import javax.swing.JList;

import eticaret.dataAccess.abstracts.IUserDao;
import eticaret.entities.concretes.User;

public class UserDao implements IUserDao {

	@Override
	public void add(User user) {
		System.out.println("Veri tabanına kullanıcı kayıtı yapıldı"+ user.getName());
		System.out.println("Lütfen e posta adresinizi dogrulayınız"+ user.getEmail());
	}

	@Override
	public void userLogin(User user) {
		System.out.println("Kullanıcı girişi yapıldı"+ user.getName()+ user.getSurname());
		
	}
	int get(int password) {
		return password;
	}
	JList<User>getAll() {
		return null;
	}
	
	
}



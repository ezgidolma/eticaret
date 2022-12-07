package eticaret.business.abstracts;

import eticaret.entities.concretes.User;

public interface UserService {

	public void add(User user);
	public void userLogin(User user);
	
}

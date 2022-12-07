package eticaret.dataAccess.abstracts;

import eticaret.entities.concretes.User;

public interface IUserDao {

	public void add(User user);
	public void userLogin(User user);
	
}

package eticaret.business.abstracts;

import eticaret.entities.concretes.User;

public interface Controller {

	public boolean password(User user);
	public boolean emailControl(User user);
	public boolean nameControl(User user);
}

package eticaret.business.concretes;

import java.util.regex.Pattern;

import eticaret.business.abstracts.Controller;
import eticaret.entities.concretes.User;

public class ControlManager implements Controller {

	@Override
	public boolean password(User user) {
		String password =user.getPassword();
		boolean dogrumu=true;
		if(password=="123456") {
			return dogrumu;
		}
		else {
			System.out.println("geçersiz şifre");
			return dogrumu;
		}
	}

	@Override
	public boolean emailControl(User user) {
		String mail=user.getEmail();
		boolean et= Pattern.matches(".*@.*", mail);//regex(içinde .com ve @ olacak)
        boolean dotCom=Pattern.matches(".*.com", mail);
        if(dotCom && et) {
        	return true;
        }
        else {
        	 System.out.println("Geçersiz Email");
	       	 return false;
        }
	}

	@Override
	public boolean nameControl(User user) {
		boolean nameControl=true;
		if(user.getName().length()>2 && user.getSurname().length()>2) {
			return nameControl;
		}
		else {
			System.out.println("Geçersiz ad ve soyad ");
			return false;
		}
		
	}

}

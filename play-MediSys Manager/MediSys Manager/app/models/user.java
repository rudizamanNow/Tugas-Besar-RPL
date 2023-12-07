package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class user extends Model {

	@Required
	@Email
	public String email;

	@Required
	public String password;

	public static user connect(String email, String password) {
        return find("byEmailAndPassword", email, password).first();
    }

	public void Login() {
		throw new UnsupportedOperationException();
	}

	public void Logout() {
		throw new UnsupportedOperationException();
	}
}
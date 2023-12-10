package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
 
@Entity
public class User extends Model {
 	@Required
	public String fullName;

	@Required
	@Email
	public String email;

	@Required
	public String password;

	public Boolean isAdmin;
	public Boolean isApotek;
	public Boolean isKeuangan;
	public Boolean isPendaftaran;
	public Boolean isPerawat;

	public String toString() {
    	return fullName;
	}

	public User(String fullName, String email, String password){
		this.fullName=fullName;
		this.email =email;
		this.password=password;
	}

	public static User connect(String email, String password) {
    	return find("byEmailAndPassword", email, password).first();
	}


	public void Login() {
		throw new UnsupportedOperationException();
	}

	public void Logout() {
		throw new UnsupportedOperationException();
	}
}
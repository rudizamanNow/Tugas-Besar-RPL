package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class pasien extends Model {

	@Required
	public String _namaPasien;
	@Required
	public int _noKTP;
	@Required
	public String _jenisKelamin;
	@Required
	public Date _tglLahir;
	@Required
	public int _noTelp;
	@Required
	public String _alamat;

	public String toString() {
		return _namaPasien;
	}

	public void insert() {
		throw new UnsupportedOperationException();
	}

	public void view() {
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}

}
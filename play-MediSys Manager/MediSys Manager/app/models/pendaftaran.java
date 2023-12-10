package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class pendaftaran extends Model{

	@Required
	public String _noPendaftaran;
	@Required
	public String _namaPasien;
	@Required
	public String _tipe;
	@Required
	public Date _tglDaftar;
	@Required
	public String _poli;
	@Required
	public int _noTelp;


	public String toString() {
		return _noPendaftaran;
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
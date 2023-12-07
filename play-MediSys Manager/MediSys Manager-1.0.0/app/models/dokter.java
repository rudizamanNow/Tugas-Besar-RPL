package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class dokter extends Model {

	@Required
	public String _namaDokter;
	@Required
	public String _jenisKelamin;
	@Required
	public String _jabatan;


	public String toString() {
		return _namaDokter;
	}

	public void insert() {
		throw new UnsupportedOperationException();
	}

	public void view() {
		throw new UnsupportedOperationException();
	}
}
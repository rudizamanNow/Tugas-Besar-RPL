package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


import java.util.Vector;

@Entity
public class obat extends Model {

	@Required
	public String _namaObat;
	@Required
	public int _stok;

	public String toString() {
		return _namaObat;
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
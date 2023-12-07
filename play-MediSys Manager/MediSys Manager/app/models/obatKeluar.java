package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class obatKeluar extends Model {
	
	@Required
    @ManyToOne
	public obat _namaObat;

	@Required
    @ManyToOne
	public pasien _namaPasien;

	@Required
	public int _jumlah;

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
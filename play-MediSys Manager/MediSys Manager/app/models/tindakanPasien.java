package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class tindakanPasien extends Model{

	@Required
    @ManyToOne
	public pasien _namaPasien;

	@Required
    @ManyToOne
    public dokter dokter;
	
	@Required
    @ManyToOne
    public tindakan _namaTindakan;

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
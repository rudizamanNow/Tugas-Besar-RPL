package models;
 
import java.util.*;
import javax.persistence.*;
import javax.swing.text.html.HTML.Tag;

import play.db.jpa.*;
import play.data.validation.*;


@Entity
public class pembayaran extends Model {
	
	@Required
    @ManyToOne
	public pasien _namaPasien;
	
	@Required
    @ManyToOne
    public tindakan _namaTindakan;
	
	@Required
	public int _biayaTindakan;

	public void insert() {
		throw new UnsupportedOperationException();
	}

	public void view() {
		throw new UnsupportedOperationException();
	}
}
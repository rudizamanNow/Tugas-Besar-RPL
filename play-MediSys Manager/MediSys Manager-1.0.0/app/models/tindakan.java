package models;
 
import java.util.*;
import javax.persistence.*;
import javax.swing.text.html.HTML.Tag;

import play.db.jpa.*;
import play.data.validation.*;

@Entity
public class tindakan extends Model {

	@Required
	public String _namaTindakan;

	@Required
	public int _biayaTindakan;

	public String toString() {
		return _namaTindakan;
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
package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datesDepart")
public class DateDepart implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_d;

	private String dateDepart;

	@ManyToOne
	@JoinColumn(name = "fk_v", referencedColumnName = "id_v")
	private Voyage voyage;

	public DateDepart() {
		super();
	}

	public DateDepart(String dateDepart) {
		super();
		this.dateDepart = dateDepart;
	}

	public DateDepart(int id_d, String dateDepart) {
		super();
		this.id_d = id_d;
		this.dateDepart = dateDepart;
	}

	public int getId_d() {
		return id_d;
	}

	public void setId_d(int id_d) {
		this.id_d = id_d;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

}

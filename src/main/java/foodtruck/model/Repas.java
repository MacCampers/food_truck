package foodtruck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "repas")
public class Repas {
	@Id
	@GeneratedValue
	private int id;
	private Repas_Enum libelle;
	private boolean actif;
	private String heure_limite;

	public Repas() {
	}

	public Repas(int id, Repas_Enum libelle, boolean actif, String heure_limite) {
		this.id = id;
		this.libelle = libelle;
		this.actif = actif;
		this.heure_limite = heure_limite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Repas_Enum getLibelle() {
		return libelle;
	}

	public void setLibelle(Repas_Enum libelle) {
		this.libelle = libelle;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getHeure_limite() {
		return heure_limite;
	}

	public void setHeure_limite(String heure_limite) {
		this.heure_limite = heure_limite;
	}

	@Override
	public String toString() {
		return "Repas [id=" + id + ", libelle=" + libelle + ", actif=" + actif + ", heure_limite=" + heure_limite + "]";
	}

}

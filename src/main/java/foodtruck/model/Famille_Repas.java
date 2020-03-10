package foodtruck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "famille_repas")
public class Famille_Repas {
	@Id
	@GeneratedValue
	private int id;
	private Famille_Repas_Enum libelle;
	private boolean actif;

	public Famille_Repas(int id, Famille_Repas_Enum libelle, boolean actif) {
		this.id = id;
		this.libelle = libelle;
		this.actif = actif;
	}

	public Famille_Repas() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Famille_Repas_Enum getLibelle() {
		return libelle;
	}

	public void setLibelle(Famille_Repas_Enum libelle) {
		this.libelle = libelle;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	@Override
	public String toString() {
		return "Famille_Repas [id=" + id + ", libelle=" + libelle + ", actif=" + actif + "]";
	}

}

package foodtruck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {
	@Id
	@GeneratedValue
	private int id;
	private int price, nb_ventes, stock;
	private String libelle_descriptif_commerciale, libelle_produit_technique, description, composition;

	public Produit(int id, int price, int nb_ventes, int stock, String libelle_descriptif_commerciale,
			String libelle_produit_technique, String description, String composition) {
		this.id = id;
		this.price = price;
		this.nb_ventes = nb_ventes;
		this.stock = stock;
		this.libelle_descriptif_commerciale = libelle_descriptif_commerciale;
		this.libelle_produit_technique = libelle_produit_technique;
		this.description = description;
		this.composition = composition;
	}

	public Produit() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNb_ventes() {
		return nb_ventes;
	}

	public void setNb_ventes(int nb_ventes) {
		this.nb_ventes = nb_ventes;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getLibelle_descriptif_commerciale() {
		return libelle_descriptif_commerciale;
	}

	public void setLibelle_descriptif_commerciale(String libelle_descriptif_commerciale) {
		this.libelle_descriptif_commerciale = libelle_descriptif_commerciale;
	}

	public String getLibelle_produit_technique() {
		return libelle_produit_technique;
	}

	public void setLibelle_produit_technique(String libelle_produit_technique) {
		this.libelle_produit_technique = libelle_produit_technique;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", price=" + price + ", nb_ventes=" + nb_ventes + ", stock=" + stock
				+ ", libelle_descriptif_commerciale=" + libelle_descriptif_commerciale + ", libelle_produit_technique="
				+ libelle_produit_technique + ", description=" + description + ", composition=" + composition + "]";
	}

}

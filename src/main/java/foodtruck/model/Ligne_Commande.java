package foodtruck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_commande")
public class Ligne_Commande {
	@Id
	@GeneratedValue
	private int id;
	private Produit id_produit;
	private Entete_Commande id_entite_commande;
	private int quantite, prix_unitaire;

	public Ligne_Commande() {
	}

	public Ligne_Commande(int id, Produit id_produit, Entete_Commande id_entite_commande, int quantite,
			int prix_unitaire) {
		this.id = id;
		this.id_produit = id_produit;
		this.id_entite_commande = id_entite_commande;
		this.quantite = quantite;
		this.prix_unitaire = prix_unitaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getId_produit() {
		return id_produit;
	}

	public void setId_produit(Produit id_produit) {
		this.id_produit = id_produit;
	}

	public Entete_Commande getId_entite_commande() {
		return id_entite_commande;
	}

	public void setId_entite_commande(Entete_Commande id_entite_commande) {
		this.id_entite_commande = id_entite_commande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(int prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	@Override
	public String toString() {
		return "Ligne_Commande [id=" + id + ", id_produit=" + id_produit + ", id_entite_commande=" + id_entite_commande
				+ ", quantite=" + quantite + ", prix_unitaire=" + prix_unitaire + "]";
	}

}

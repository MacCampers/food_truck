package foodtruck.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entite_commande")
public class Entete_Commande {
	@Id
	@GeneratedValue
	private int id;
	private Repas id_repas;
	private String date_commande, id_adresse_commande, id_adresse_facturation;
	private int total_commande, num_facturation;
	private boolean is_delivered;
}

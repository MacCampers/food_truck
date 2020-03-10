package foodtruck.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import foodtruck.model.Produit;

@Repository
public interface ActualiteRepository extends  JpaRepository<Produit, Integer> {

}

package tn.esprit.ski.Repostories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Abonnement;

public interface IAbonnementRepository extends CrudRepository<Abonnement,Long> {
}

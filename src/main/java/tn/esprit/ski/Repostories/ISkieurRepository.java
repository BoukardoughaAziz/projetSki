package tn.esprit.ski.Repostories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Skieur;

public interface ISkieurRepository extends CrudRepository<Skieur,Long> {
}

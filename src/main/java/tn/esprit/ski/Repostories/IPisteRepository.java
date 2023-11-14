package tn.esprit.ski.Repostories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Piste;

public interface IPisteRepository extends CrudRepository<Piste,Long> {
}

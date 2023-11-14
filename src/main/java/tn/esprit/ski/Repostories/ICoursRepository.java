package tn.esprit.ski.Repostories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Cours;

public interface ICoursRepository extends CrudRepository<Cours,Long> {
}

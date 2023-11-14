package tn.esprit.ski.Sevices;

import tn.esprit.ski.entities.Cours;
import tn.esprit.ski.entities.Inscreption;

import java.util.List;

public interface ICoursServices {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    Inscreption assignRegistrationToCourse(Long numInscreption, Long numCours);
}

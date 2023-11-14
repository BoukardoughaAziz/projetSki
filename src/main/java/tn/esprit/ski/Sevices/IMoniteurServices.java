package tn.esprit.ski.Sevices;

import tn.esprit.ski.entities.Moniteur;
import tn.esprit.ski.entities.Piste;

import java.util.List;

public interface IMoniteurServices {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours);
}

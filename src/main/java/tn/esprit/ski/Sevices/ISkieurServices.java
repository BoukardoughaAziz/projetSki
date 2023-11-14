package tn.esprit.ski.Sevices;

import tn.esprit.ski.entities.Inscreption;
import tn.esprit.ski.entities.Skieur;

import java.util.List;

public interface ISkieurServices {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
    Inscreption addRegistrationAndAssignToSkier(Inscreption inscription, Long numSkieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
}

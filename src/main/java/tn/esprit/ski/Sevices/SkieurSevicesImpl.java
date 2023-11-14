package tn.esprit.ski.Sevices;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Repostories.IAbonnementRepository;
import tn.esprit.ski.Repostories.IInscreptionRepository;
import tn.esprit.ski.Repostories.IPisteRepository;
import tn.esprit.ski.Repostories.ISkieurRepository;
import tn.esprit.ski.Sevices.ISkieurServices;
import tn.esprit.ski.entities.*;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SkieurSevicesImpl implements ISkieurServices {
    @Autowired
    final ISkieurRepository skieurRepository;
    final IAbonnementRepository abonnementRepository;
    final IInscreptionRepository inscreptionRepository;
    final IPisteRepository pisteRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
            Abonnement abonnement = new Abonnement();

            LocalDate thisyear = LocalDate.now();
            int year = thisyear.getYear();
            //date debut
            LocalDate datedebut = LocalDate.of(year, thisyear.getMonth(), thisyear.getDayOfMonth());

            //date fin
            LocalDate datefin = LocalDate.of(year + 1, thisyear.getMonth(), thisyear.getDayOfMonth());


            abonnement.setDateDebut(datedebut);
            abonnement.setDateFin(datefin);
            abonnement.setPrixAbonnement(12f);
            abonnement.setTypeAbonnement(TypeAbonnement.ANNUEL);
            abonnementRepository.save(abonnement);
            skieurRepository.save(skieur);
            Long test =abonnement.getNumAbonnement();
            skieur.setAbonnement(abonnement);


                return skieur;
        }


    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
        Skieur skieur =skieurRepository.findById(numSkieur).orElse(null);
        Abonnement abonnementASupprimer = skieur.getAbonnement();
        abonnementRepository.delete(abonnementASupprimer);

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Inscreption addRegistrationAndAssignToSkier(Inscreption inscription, Long numSkieur) {
        Skieur nouveauskieur = skieurRepository.findById(numSkieur).orElse(null);
        inscription.setSkieur(nouveauskieur);
        Inscreption savedinscreption= inscreptionRepository.save(inscription);
        return savedinscreption;
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);

        skieur.getPiste().add(piste);
        piste.getSkieur().add(skieur);
        pisteRepository.save(piste);
        return skieurRepository.save(skieur);

    }
}

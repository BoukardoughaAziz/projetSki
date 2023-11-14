package tn.esprit.ski.Sevices;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Repostories.ICoursRepository;
import tn.esprit.ski.Repostories.IMoniteurRepository;
import tn.esprit.ski.entities.Cours;
import tn.esprit.ski.entities.Moniteur;

import java.util.List;

@Service
@RequiredArgsConstructor

public class MoniteurServicesImpl implements IMoniteurServices{
    final IMoniteurRepository moniteurRepository;
    final ICoursRepository coursRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        moniteur.getCours().add(cours);
        moniteurRepository.save(moniteur);
        return moniteur;
    }
}

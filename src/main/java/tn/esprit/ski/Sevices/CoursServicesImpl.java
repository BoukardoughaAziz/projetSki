package tn.esprit.ski.Sevices;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Repostories.ICoursRepository;
import tn.esprit.ski.Repostories.IInscreptionRepository;
import tn.esprit.ski.entities.Cours;
import tn.esprit.ski.entities.Inscreption;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CoursServicesImpl implements ICoursServices{
    final ICoursRepository coursRepository;
    final IInscreptionRepository inscreptionRepository;
    @Override
    public List<Cours> retrieveAllCourses() {
        return (List<Cours>) coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public Inscreption assignRegistrationToCourse(Long numInscreption, Long numCours) {
        Inscreption inscreption =inscreptionRepository.findById(numInscreption).orElse(null);
        Cours cours = coursRepository.findById(numCours).orElse(null);
            inscreption.setCours(cours);
            cours.getInscreption().add(inscreption);
            return inscreption;
    }
}

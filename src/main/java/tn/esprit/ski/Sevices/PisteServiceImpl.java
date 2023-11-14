package tn.esprit.ski.Sevices;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Repostories.IPisteRepository;
import tn.esprit.ski.entities.Piste;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PisteServiceImpl implements IPisteServices{
    final IPisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }
}

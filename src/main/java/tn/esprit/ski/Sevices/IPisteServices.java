package tn.esprit.ski.Sevices;

import tn.esprit.ski.entities.Piste;

import java.util.List;

public interface IPisteServices {
    List<Piste> retrieveAllPistes();

    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}

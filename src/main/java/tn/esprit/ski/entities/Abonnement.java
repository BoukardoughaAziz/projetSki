package tn.esprit.ski.entities;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Getter
@Setter

public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbonnement;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float prixAbonnement;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbonnement;




}

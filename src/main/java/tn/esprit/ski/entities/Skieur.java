package tn.esprit.ski.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter

public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomSkieur;
    private String prenomSkieur;
    private LocalDate datenasissence;
    private String ville;

    @ManyToMany
    private Set<Piste> piste;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscreption> inscreption;



}

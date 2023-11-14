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

public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur ;
    private String nomMoniteur;
    private String prenomMoniteur;
    private LocalDate dateRecrutement;

    @OneToMany
    private Set<Cours> cours;


}

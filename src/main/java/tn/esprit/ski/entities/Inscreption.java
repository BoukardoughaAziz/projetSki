package tn.esprit.ski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter

public class Inscreption implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscreption;
    private int numSemaine;


    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    private Cours cours;

}

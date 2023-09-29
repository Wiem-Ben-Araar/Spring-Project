package com.example.foyerwiembenaraar.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity

@Table(name = "Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idEtudiant;
    @Column(name="firstName")
    private String nomEt;
    @Column(name="lastName")
    private String prenomEt;

    private LocalDate dateNaissance;

    private long cin;
    private String ecole;

}

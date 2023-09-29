package com.example.foyerwiembenaraar.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Univerrsite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    @Column(name="NameUniversity")
    private String nomUniversite;
    @Column(name="adresse")
    private String adresse;
}

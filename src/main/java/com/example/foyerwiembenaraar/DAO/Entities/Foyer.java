package com.example.foyerwiembenaraar.DAO.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name="Foyer")
public class Foyer {

    @Id
    private long idFoyer;
    @Column(name="foyerName")
    private String nomFoyer;
    @Column(name="capaciteFoyer")
    private long capaciteFoyer;
}

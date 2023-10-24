package com.example.foyerwiembenaraar.DAO.Entities;

import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Foyer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Foyer implements Serializable {
    @Id
    private  String idFoyer ;
    @Column(name="nomFoyer")
    private String nomFoyer ;

    @Column(name="capaciteFoyer")
    private long capaciteFoyer ;
    @JsonIgnoreProperties("foyer")
    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> bloc;


}
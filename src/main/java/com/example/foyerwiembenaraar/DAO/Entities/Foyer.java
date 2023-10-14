package com.example.foyerwiembenaraar.DAO.Entities;

import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Foyer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Foyer {
    @Id
    private  String idFoyer ;
    @Column(name="nomFoyer")
    private String nomFoyer ;

    @Column(name="capaciteFoyer")
    private long capaciteFoyer ;

    @OneToOne(mappedBy = "foyer")
    private Universite universite ;
}
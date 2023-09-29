package com.example.foyerwiembenaraar.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Chambre")
public class Chambre {
   @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idChambre;

   private long  numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;



}

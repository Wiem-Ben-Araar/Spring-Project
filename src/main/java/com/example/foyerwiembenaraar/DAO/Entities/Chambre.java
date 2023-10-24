package com.example.foyerwiembenaraar.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Chambre")
public class Chambre implements Serializable {
   @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idChambre;

   private long  numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;


    @ManyToOne(cascade =  CascadeType.ALL)
    Reservation res  ;


}

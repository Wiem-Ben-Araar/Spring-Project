package com.example.foyerwiembenaraar.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Chambre")
public class Chambre {
   @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idChambre;

   private long  numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Bloc> blocs;

    @ManyToOne(cascade =  CascadeType.ALL)
    Reservation res  ;


}

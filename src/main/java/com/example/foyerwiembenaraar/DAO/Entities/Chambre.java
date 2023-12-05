package com.example.foyerwiembenaraar.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
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
@Column(unique = true)
   private long  numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @JsonIgnore
    @ManyToOne
    Bloc bloc ;

    @OneToMany(cascade =  CascadeType.ALL)
    private  Set<Reservation> reservations =new HashSet<>();



}

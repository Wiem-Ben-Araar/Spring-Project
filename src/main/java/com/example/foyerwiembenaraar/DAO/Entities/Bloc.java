package com.example.foyerwiembenaraar.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Bloc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idBloc ;
    @Column(name="nomBloc")
    private String nomBloc ;
    @Column(name="capaciteBloc")
    private int capaciteBloc ;

    @JsonIgnore
    @ManyToOne
    Foyer foyer ;


    @OneToMany(mappedBy = "bloc" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Chambre> chambres = new HashSet<>();
}
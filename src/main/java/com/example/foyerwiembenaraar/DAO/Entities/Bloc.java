package com.example.foyerwiembenaraar.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name="Bloc")
public class Bloc {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idBloc;
    @Column(name="NameBloc")
    private String nomBloc;
    @Column(name="BlocCapacity")
    private long capaciteBloc;
}

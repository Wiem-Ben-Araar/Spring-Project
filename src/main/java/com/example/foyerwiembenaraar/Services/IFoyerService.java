package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer (Foyer f );


    List<Foyer> addFoyers(List<Foyer>foyers);
    Foyer editFoyer (Foyer f);

    List<Foyer> findAll();

    Foyer findById(long id);

    void deleteById(long id);

    void delete(Foyer f);

    List<Foyer> getFoyersByBloc(Bloc bloc);
    Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;


}

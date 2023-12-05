package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite (Universite u );


    List<Universite> addUniversites(List<Universite>universites);
    Universite editUniversite (Universite u);

    List<Universite> findAll();

    Universite findById(long id);

    void deleteById(long id);

    void delete(Universite u);

    Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;
    Universite desaffecterFoyerAUniversite(long idUniversite);


}

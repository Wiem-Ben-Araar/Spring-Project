package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant (Etudiant e );


    List<Etudiant> addEtudiants(List<Etudiant>etudiants);
    Etudiant editEtudiant (Etudiant e);

    List<Etudiant> findAll();

    Etudiant findById(long id);

    void deleteById(long id);

    void delete(Etudiant e);
}

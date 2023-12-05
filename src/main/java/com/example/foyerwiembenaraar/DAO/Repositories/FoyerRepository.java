package com.example.foyerwiembenaraar.DAO.Repositories;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepository extends JpaRepository <Foyer,Long> {
    //1- Recherche d'un foyer d'un bloc spécifique
    List<Foyer> findByBlocs(Bloc bloc);
    // Recherche d'un foyer par son nom
    Foyer findFoyerByNomFoyer(String nomFoyer);


}

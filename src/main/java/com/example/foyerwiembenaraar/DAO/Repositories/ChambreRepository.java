package com.example.foyerwiembenaraar.DAO.Repositories;


import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    // 1. Recherche par numéro de chambre
    Chambre findByNumeroChambre(long numeroChambre);

    // 2. Recherche par type de chambre
    List<Chambre> findByTypeChambre(TypeChambre typeChambre);


    List<Chambre> findByBloc(Bloc bloc);



}

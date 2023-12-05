package com.example.foyerwiembenaraar.DAO.Repositories;


import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    // 1. Recherche par numéro de chambre
    Chambre findByNumeroChambre(long numeroChambre);

    // 2. Recherche par type de chambre
    List<Chambre> findByTypeChambre(TypeChambre typeChambre);

    //3- Recherche des chambres par bloc
    List<Chambre> findByBloc(Bloc bloc);

   // @Query("select c from Chambre c where c.numeroChambre=?1")


    @Query(nativeQuery = true,value="select * from Chambre where numeroChambre=?1")
    List<Chambre> selectByNum(long num);


    @Query(value="seelect *from chambre where numeroChambre=?1 ",nativeQuery = true)
    List<Chambre> selectByNumSQL(long num);

    int countChambreByTypeChambre(TypeChambre type);

}

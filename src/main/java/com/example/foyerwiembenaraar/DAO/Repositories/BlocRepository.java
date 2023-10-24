package com.example.foyerwiembenaraar.DAO.Repositories;



import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findByNomBloc(String nomBloc); // 1- Recherche par nomBloc
    List<Bloc> findByCapaciteBloc(int capaciteBloc); // 2- Recherche par capaciteBloc

    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, int capaciteBloc); // 3- Recherche par nomBloc et capaciteBloc
    List<Bloc> findByNomBlocIgnoreCase(String nomBloc); // 4- Recherche par nomBloc en ignorant la casse
    List<Bloc> findByCapaciteBlocGreaterThan(int capaciteMin); // 5- Recherche par capaciteBloc supérieure à une valeur donnée
    List<Bloc> findByNomBlocContaining(String sousChaine); // 6- Recherche par nomBloc contenant une sous-chaîne

    List<Bloc> findAllByOrderByNomBlocAsc(); // 7- Tri par nomBloc par ordre alphabétique

    // 8- Recherche par nomBloc ou capaciteBloc
    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capaciteBloc);





}

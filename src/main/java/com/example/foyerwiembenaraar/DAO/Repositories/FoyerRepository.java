package com.example.foyerwiembenaraar.DAO.Repositories;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepository extends JpaRepository <Foyer,Long> {
    List<Foyer> findByBloc(Bloc bloc);
}

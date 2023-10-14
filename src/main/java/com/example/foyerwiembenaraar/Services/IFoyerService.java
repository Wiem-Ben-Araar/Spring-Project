package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer (Foyer f );


    List<Foyer> addFoyers(List<Foyer>foyers);
    Foyer editFoyer (Foyer f);

    List<Foyer> findAll();

    Foyer findById(long id);

    void deleteById(long id);

    void delete(Foyer f);
}

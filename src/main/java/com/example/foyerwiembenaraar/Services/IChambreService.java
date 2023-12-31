package com.example.foyerwiembenaraar.Services;


import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.TypeChambre;

import java.util.List;

public interface IChambreService {


    Chambre addChambre (Chambre c );


    List<Chambre> addChambres(List<Chambre>chambres);
    Chambre editChambre (Chambre c);

    List<Chambre> findAll();

    Chambre findById(long id);

    void deleteById(long id);

    void delete(Chambre c);

    List<Chambre> getChambresParNomBloc( String nomBloc) ;

    void listeChambreParBloc();
    void pourcentageChambreParTypeChambre();
    void nbPlacesDisponibleParChambreAnneeEnCours();
}

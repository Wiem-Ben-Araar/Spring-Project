package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation (Reservation r );


    List<Reservation> addReservations(List<Reservation>reservations);
    Reservation editReservation (Reservation r);

    List<Reservation> findAll();





    Reservation findById(String id);

    void deleteById(String id);

    void delete(Reservation r);

    Reservation ajouterReservationEtAssignerAChambreEtAEtudiant (int numChambre, long cin) ;
}

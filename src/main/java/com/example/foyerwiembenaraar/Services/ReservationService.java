package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Reservation;
import com.example.foyerwiembenaraar.DAO.Repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;
@Builder
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{

    ReservationRepository reservationRepository;


    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    @Override
    public Reservation editReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(String id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public void deleteById(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public void delete(Reservation r) {
        reservationRepository.delete(r);
    }


}

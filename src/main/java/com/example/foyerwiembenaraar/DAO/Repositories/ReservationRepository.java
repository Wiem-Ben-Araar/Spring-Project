package com.example.foyerwiembenaraar.DAO.Repositories;

import com.example.foyerwiembenaraar.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation,String> {
}

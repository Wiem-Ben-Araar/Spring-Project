package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Reservation;
import com.example.foyerwiembenaraar.Services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;

    @GetMapping("findAllR")
    List<Reservation> findAll(){
        return iReservationService.findAll();
    }

    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation r){
        return iReservationService.addReservation(r);
    }

    @PutMapping("updateReservation")
    Reservation updateReservation(@RequestBody Reservation r){
        return iReservationService.editReservation(r);
    }

    @DeleteMapping("DeleteReservation/{id}")
    void DeleteReservationByID(@PathVariable("id") String id){
        iReservationService.deleteById(id);
    }

    @DeleteMapping("DeleteReservation")
    void DeleteReservation(@RequestBody Reservation r){
        iReservationService.delete(r);
    }

    @PostMapping("generateReservation/{numchamber}/{cin}")
    Reservation addReseravationavecChamber(@PathVariable("numchamber") int numero ,  @PathVariable("cin") long cin){
        return iReservationService.ajouterReservationEtAssignerAChambreEtAEtudiant(numero, cin);
    }
}

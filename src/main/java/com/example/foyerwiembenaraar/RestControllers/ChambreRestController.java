package com.example.foyerwiembenaraar.RestControllers;


import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.TypeChambre;
import com.example.foyerwiembenaraar.Services.ChambreService;

import com.example.foyerwiembenaraar.Services.IBlocService;
import com.example.foyerwiembenaraar.Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {

    IChambreService iChambreService;
    IBlocService iBlocService;

    @GetMapping("findAllC")
    List<Chambre> findAll(){
        return iChambreService.findAll();
    }

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }

    @PutMapping("updateChambre")
    Chambre editChamber(@RequestBody Chambre c){
        return iChambreService.editChambre(c);
    }

    @DeleteMapping("deleteChamberById/{id}")
    void DeleteChamberByID(@PathVariable("id") long id){
        iChambreService.deleteById(id);
    }

    @DeleteMapping("deleteChambre")
    void DeleteChambre(@RequestBody Chambre c){
        iChambreService.delete(c);
    }

    @GetMapping("getChamberList/{nomBloc}")
    List<Chambre> getChambresParNomBloc(@PathVariable("nomBloc") String nomBloc){
        return iChambreService.getChambresParNomBloc(nomBloc);
    }



}

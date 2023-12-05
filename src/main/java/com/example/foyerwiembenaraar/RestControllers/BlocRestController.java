package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import com.example.foyerwiembenaraar.Services.IBlocService;
import com.example.foyerwiembenaraar.Services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@AllArgsConstructor

public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("findAll")
    List<Bloc> findAll(){
        return iBlocService.findAll();
    }

    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc b){
        return iBlocService.addBloc(b);
    }

    @GetMapping("findById/{id}")
    Bloc findById(@PathVariable("id") long id){
        return iBlocService.findById(id);
    }

    @DeleteMapping("deleteByID/{id}")
    void deleteByID(@PathVariable("id") long id){
        iBlocService.deleteById(id);
    }

    @DeleteMapping("deleteB")
    void delete(@RequestBody Bloc b){
        iBlocService.delete(b);
    }

    @PutMapping("editBloc")
    Bloc editBloc(@RequestBody Bloc b){
        return iBlocService.editBloc(b);
    }

    @GetMapping("/blocs/search")
    public List<Bloc> searchByNomBloc(@RequestParam("nomBloc") String nomBloc) {
        return iBlocService.findByNomBloc(nomBloc);
    }

    @GetMapping("/blocs/findByCapaciteBloc")
    public List<Bloc> findByCapaciteBloc(@RequestParam("capaciteBloc") int capaciteBloc) {
        return iBlocService.findByCapaciteBloc(capaciteBloc);
    }

    @GetMapping("/blocs/searchByNomBlocAndCapaciteBloc")
    public List<Bloc> searchByNomBlocAndCapaciteBloc(
            @RequestParam("nomBloc") String nomBloc,
            @RequestParam("capaciteBloc") int capaciteBloc) {
        return iBlocService.findByNomBlocAndCapaciteBloc(nomBloc, capaciteBloc);
    }

    @GetMapping("/blocs/searchByNomBlocIgnoreCase")
    public List<Bloc> searchByNomBlocIgnoreCase(@RequestParam("nomBloc") String nomBloc) {
        return iBlocService.findByNomBlocIgnoreCase(nomBloc);
    }


    @GetMapping("/blocs/searchByCapaciteBlocGreaterThan")
    public List<Bloc> searchByCapaciteBlocGreaterThan(@RequestParam("capaciteBloc") int capaciteBloc) {
        return iBlocService.findByCapaciteBlocGreaterThan(capaciteBloc);
    }

    @GetMapping("/blocs/searchByNomBlocContaining")
    public List<Bloc> searchByNomBlocContaining(@RequestParam("subString") String subString) {
        return iBlocService.findByNomBlocContaining(subString);
    }

    @GetMapping("/blocs/findAllByOrderByNomBlocAsc")
    public List<Bloc> findAllByOrderByNomBlocAsc() {
        return iBlocService.findAllByOrderByNomBlocAsc();
    }

    @GetMapping("/blocs/searchByNomBlocOrCapaciteBloc")
    public List<Bloc> searchByNomBlocOrCapaciteBloc(
            @RequestParam("nomBloc") String nomBloc,
            @RequestParam("capaciteBloc") int capaciteBloc) {
        return iBlocService.findByNomBlocOrCapaciteBloc(nomBloc, capaciteBloc);
    }

    @PutMapping("affecterChamberABloc/{nomBloc}")
    Bloc affecterChambresABloc(@RequestBody List<Integer> numeros , @PathVariable("nomBloc") String nomBloc){
        return iBlocService.affecterChambresABloc(numeros , nomBloc);
    }


    @PutMapping("affecterBlocFoyer/{nomBloc}/{nomFoyer}")
    Bloc affecterBlocAFoyer(@PathVariable("nomFoyer") String nomFoyer ,
                            @PathVariable("nomBloc") String nomBloc ){
        return iBlocService.affecterBlocAFoyer(nomBloc, nomFoyer);
    }

}

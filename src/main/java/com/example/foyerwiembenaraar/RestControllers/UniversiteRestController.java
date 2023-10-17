package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Reservation;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import com.example.foyerwiembenaraar.Services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService iUniversiteService;

    @GetMapping("findAllU")
    List<Universite> findAll(){
        return iUniversiteService.findAll();
    }

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return iUniversiteService.addUniversite(u);
    }

    @PutMapping("updateUniversite")
    Universite updateUniversite(@RequestBody Universite u){
        return iUniversiteService.editUniversite(u);
    }



    @DeleteMapping("DeleteUniversite")
    void DeleteUniversite(@RequestBody Universite u){
        iUniversiteService.delete(u);
    }
}

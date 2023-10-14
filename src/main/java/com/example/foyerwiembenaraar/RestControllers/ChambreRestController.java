package com.example.foyerwiembenaraar.RestControllers;


import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.Services.ChambreService;

import com.example.foyerwiembenaraar.Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {

    IChambreService iChambreService;

    @GetMapping("findAllC")
    List<Chambre> findAll(){
        return iChambreService.findAll();
    }

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }
}

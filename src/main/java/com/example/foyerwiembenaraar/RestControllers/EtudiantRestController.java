package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Etudiant;
import com.example.foyerwiembenaraar.Services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantService iEtudiantService;
    @GetMapping("findAllE")
    List<Etudiant> findAll(){
        return iEtudiantService.findAll();
    }

    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return iEtudiantService.addEtudiant(e);
    }
}

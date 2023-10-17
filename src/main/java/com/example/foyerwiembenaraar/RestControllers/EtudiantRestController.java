package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Etudiant;
import com.example.foyerwiembenaraar.Services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant e){
        return  iEtudiantService.editEtudiant(e);
    }

    @DeleteMapping("DeleteByIDEtudiant/{id}")
    void DeleteEtudiantByID(@PathVariable("id") long id){
        iEtudiantService.deleteById(id);
    }

    @DeleteMapping("deleteEtudiant")
    void DeleteEtudiant (@RequestBody Etudiant e){
        iEtudiantService.delete(e);
    }
}

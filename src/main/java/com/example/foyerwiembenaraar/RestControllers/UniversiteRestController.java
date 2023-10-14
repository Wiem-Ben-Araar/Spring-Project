package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import com.example.foyerwiembenaraar.Services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}

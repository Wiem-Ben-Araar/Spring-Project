package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import com.example.foyerwiembenaraar.DAO.Repositories.BlocRepository;
import com.example.foyerwiembenaraar.Services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService iFoyerService;
    BlocRepository blocRepository;

    @GetMapping("findAllF")
    List<Foyer> findAll(){
        return iFoyerService.findAll();
    }

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer f){
        return iFoyerService.addFoyer(f);
    }

    @PutMapping("UpdateFoyer")
    Foyer updateFoyer(@RequestBody Foyer f){
        return iFoyerService.editFoyer(f);
    }
    @DeleteMapping("DeleteFoyer")
    void DeleteFoyer(@RequestBody Foyer f){
        iFoyerService.delete(f);
    }


    @GetMapping("/byBloc/{blocId}")
    public List<Foyer> getFoyersByBloc(@PathVariable Long blocId) {
        Bloc bloc = blocRepository.findById(blocId).orElse(null);

        if (bloc == null) {
            return null;
        }

        return iFoyerService.getFoyersByBloc(bloc);
    }
}

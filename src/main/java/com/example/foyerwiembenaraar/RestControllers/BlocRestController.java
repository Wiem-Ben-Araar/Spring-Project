package com.example.foyerwiembenaraar.RestControllers;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.Services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}

package com.example.foyerwiembenaraar.DAO.Schedular;

import com.example.foyerwiembenaraar.Services.ChambreService;
import com.example.foyerwiembenaraar.Services.IChambreService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@Component
@Slf4j //bch nkharej msg fii blsate system.out
public class test {
    IChambreService iChamberService;


    @Scheduled(fixedRate = 60000)
    void affiche(){
        iChamberService.listeChambreParBloc();
    }

    @Scheduled(fixedRate = 300000)
    void affiche2(){
        iChamberService.pourcentageChambreParTypeChambre();
    }
}
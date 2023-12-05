package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.TypeChambre;
import com.example.foyerwiembenaraar.DAO.Repositories.BlocRepository;
import com.example.foyerwiembenaraar.DAO.Repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Builder
@Service
@AllArgsConstructor
@Slf4j
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;


    public void listeChambreParBloc(){
        List<Bloc> blocs = blocRepository.findAll();
        blocs.forEach(bloc -> {
            log.info(" Bloc => "+ bloc.getNomBloc()+" ayant une capacite "+bloc.getCapaciteBloc());
            if(bloc.getChambres().isEmpty()){
                log.info("Pas de chamber disponible dans ce bloc");
            }else{
                bloc.getChambres().forEach(chambre -> {
                    log.info("NumChamber"+chambre.getNumeroChambre()+" type : "+chambre.getTypeChambre());
                    log.info("la liste des Chambres pour ce bloc ");

                });
            }

        });
    }
    public void pourcentageChambreParTypeChambre(){


        int nbSimple = chambreRepository.countChambreByTypeChambre(TypeChambre.SIMPLE);
        int nbDoube = chambreRepository.countChambreByTypeChambre(TypeChambre.DOUBLE);
        int nbTriple = chambreRepository.countChambreByTypeChambre(TypeChambre.TRIPLE);
        long allChambre = chambreRepository.count();
        log.info("Nombre Total des chambres:"+allChambre);
        log.info("Le prourcentage des chambres pour le type SIMPLE est égale a "+nbSimple/allChambre*100);
        log.info("Le prourcentage des chambres pour le type DOUBLE est égale a "+nbDoube/allChambre*100);
        log.info("Le prourcentage des chambres pour le type TRIPLE est égale a "+nbTriple/allChambre*100);
    }

    @Override
    public void nbPlacesDisponibleParChambreAnneeEnCours() {

    }


    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre editChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void delete(Chambre b) {

    }

    @Override
    public List<Chambre> getChambresParNomBloc(String nomBloc) {
        Bloc b = blocRepository.getBlocByNomBloc(nomBloc);
        return chambreRepository.findByBloc(b) ;
    }



}


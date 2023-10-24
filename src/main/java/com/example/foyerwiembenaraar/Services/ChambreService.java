package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.TypeChambre;
import com.example.foyerwiembenaraar.DAO.Repositories.BlocRepository;
import com.example.foyerwiembenaraar.DAO.Repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;

@Builder
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;


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
    public Chambre findChambreByNumero(long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> findChambreByType(TypeChambre typeChambre) {
        return chambreRepository.findByTypeChambre(typeChambre);
    }
    @Override
    public List<Chambre> findByBloc(Bloc bloc) {
        return chambreRepository.findByBloc(bloc);
    }

    // Recherche des chambres par bloc et type de chambre

}

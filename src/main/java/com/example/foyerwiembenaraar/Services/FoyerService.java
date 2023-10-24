package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import com.example.foyerwiembenaraar.DAO.Repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Builder
@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{

    FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> addFoyers(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public Foyer editFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
foyerRepository.deleteById(id);
    }

    @Override
    public void delete(Foyer f) {
foyerRepository.delete(f);
    }


    @Override
    public List<Foyer> getFoyersByBloc(Bloc bloc) {
        return foyerRepository.findByBloc(bloc);
    }


}

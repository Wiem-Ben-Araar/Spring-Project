package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Foyer;
import com.example.foyerwiembenaraar.DAO.Entities.Universite;
import com.example.foyerwiembenaraar.DAO.Repositories.BlocRepository;
import com.example.foyerwiembenaraar.DAO.Repositories.ChambreRepository;
import com.example.foyerwiembenaraar.DAO.Repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder
@Service
@AllArgsConstructor
public class BlocService implements IBlocService{
FoyerRepository foyerRepository;
BlocRepository blocRepository;
ChambreRepository chambreRepository;

        @Override
        public Bloc addBloc(Bloc b) {
                return blocRepository.save(b); //on ajoute une ligne
        }

        @Override
        public List<Bloc> addBlocs(List<Bloc> blocs) {
                return blocRepository.saveAll(blocs); //on ajoute Des lignes dans la BD
        }

        @Override
        public Bloc editBloc(Bloc b) {
                return blocRepository.save(b); //pour faire la modification
        }

        @Override
        public List<Bloc> findAll() {
                return blocRepository.findAll();
        }

        @Override
        public Bloc findById(long id) {
               // return blocRepository.findById(id).get();
                //ou bien
                //ou bien
                return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("pas de bloc").build());


        }

        @Override
        public void deleteById(long id) {
                blocRepository.deleteById(id);

        }

        @Override
        public void delete(Bloc b) {
                blocRepository.delete(b);

        }

        @Override
        public List<Bloc> findByNomBloc(String nomBloc) {
                return blocRepository.findByNomBloc(nomBloc);
        }
        @Override
        public List<Bloc> findByCapaciteBloc(int capaciteBloc) {
                return blocRepository.findByCapaciteBloc(capaciteBloc);
        }
        @Override
        public List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, int capaciteBloc) {
                return blocRepository.findByNomBlocAndCapaciteBloc(nomBloc, capaciteBloc);
        }
        @Override
        public List<Bloc> findByNomBlocIgnoreCase(String nomBloc) {
                return blocRepository.findByNomBlocIgnoreCase(nomBloc);
        }

        @Override
        public List<Bloc> findByCapaciteBlocGreaterThan(int capacite) {
                return blocRepository.findByCapaciteBlocGreaterThan(capacite);
        }

        @Override
        public List<Bloc> findByNomBlocContaining(String subString) {
                return blocRepository.findByNomBlocContaining(subString);
        }

        @Override
        public List<Bloc> findAllByOrderByNomBlocAsc() {
                return blocRepository.findAllByOrderByNomBlocAsc();
        }

        @Override
        public List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capaciteBloc) {
                return blocRepository.findByNomBlocOrCapaciteBloc(nomBloc, capaciteBloc);
        }


        @Override
        public Bloc affecterChambresABloc(List<Integer> numChambre, String nomBloc) {
                Bloc b = blocRepository.getBlocByNomBloc(nomBloc);
                Set<Chambre> chambres = new HashSet<>();
                numChambre.forEach(numero ->{
                        Chambre c = chambreRepository.findByNumeroChambre(numero);
                        c.setBloc(b);
                        chambreRepository.save(c);

                });
               return b;
        }


        @Override
        public Bloc affecterBlocAFoyer(String nomBloc, String nomFoyer) {
                //Parent howa Bloc
                Foyer f = foyerRepository.findFoyerByNomFoyer(nomFoyer);
                Bloc b = blocRepository.getBlocByNomBloc(nomBloc);
                b.setFoyer(f);

                return blocRepository.save(b);
        }
}

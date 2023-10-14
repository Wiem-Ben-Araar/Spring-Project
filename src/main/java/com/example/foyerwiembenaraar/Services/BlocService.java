package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import com.example.foyerwiembenaraar.DAO.Repositories.BlocRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Builder
@Service
@AllArgsConstructor
public class BlocService implements IBlocService{

        BlocRepository blocRepository;


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
}

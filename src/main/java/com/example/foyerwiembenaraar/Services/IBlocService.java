package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Bloc;

import java.util.List;

public interface IBlocService {

    Bloc addBloc(Bloc b );


    List<Bloc> addBlocs(List<Bloc>blocs);
    Bloc editBloc (Bloc b);

    List<Bloc> findAll();

    Bloc findById(long id);

    void deleteById(long id);

    void delete(Bloc b);



}

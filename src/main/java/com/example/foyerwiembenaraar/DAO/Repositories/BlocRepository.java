package com.example.foyerwiembenaraar.DAO.Repositories;



import com.example.foyerwiembenaraar.DAO.Entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;



public interface BlocRepository extends JpaRepository<Bloc, Long> {
}

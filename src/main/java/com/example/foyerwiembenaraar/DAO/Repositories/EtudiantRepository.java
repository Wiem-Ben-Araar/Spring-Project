package com.example.foyerwiembenaraar.DAO.Repositories;

import com.example.foyerwiembenaraar.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository <Etudiant,Long> {
}

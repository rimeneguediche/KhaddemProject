package com.example.khaddemproject.Repositorys;

import com.example.khaddemproject.Entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant , Long> {
}

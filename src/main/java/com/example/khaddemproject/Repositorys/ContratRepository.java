package com.example.khaddemproject.Repositorys;

import com.example.khaddemproject.Entites.Contrat;
import com.example.khaddemproject.Entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface ContratRepository extends JpaRepository<Contrat , Integer> {

    Integer countByArchiveIsFalseAndEtudiant(Etudiant e);
    Integer countByArchiveIsFalseAndDateDebutContratBetween(Date startDate , Date endDate);
}

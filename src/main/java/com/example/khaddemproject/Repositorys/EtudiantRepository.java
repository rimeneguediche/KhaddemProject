package com.example.khaddemproject.Repositorys;

import com.example.khaddemproject.Entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface EtudiantRepository extends JpaRepository<Etudiant , Long> {

Etudiant findByNomEtudiantAndPrenomEtudiant( String nom , String prenom);


//@Query ("select e from Etudiant e where e.nomEtudiant =:nom and e.prenomEtudiant =:prenom")
//Etudiant  getEtudiantByNomEtudiantAndAndPrenomEtudiant(@Param("nom") String nomEtudiant , @Param("prenom") String prenomEtudiant);
    List<Etudiant> getEtudiantByDepartement_IdDepartement(Integer idDepartement);
}

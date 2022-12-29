package com.example.khaddemproject.Services;

import com.example.khaddemproject.Entites.Contrat;
import com.example.khaddemproject.Entites.Departement;
import com.example.khaddemproject.Entites.Equipe;
import com.example.khaddemproject.Entites.Etudiant;
import com.example.khaddemproject.Repositorys.ContratRepository;
import com.example.khaddemproject.Repositorys.DepartementRepository;
import com.example.khaddemproject.Repositorys.EquipeRepository;
import com.example.khaddemproject.Repositorys.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@Service

public class EtudiantServiceImp implements  IEtudiantServices {

   final private   EtudiantRepository etudiantRepository ;
    final private DepartementRepository departementRepository;

    final private  EquipeRepository equipeRepository ;
    final private ContratRepository contratRepository ;
    @Override
    public List<Etudiant> getALLEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteETudiant(Long id) {
        etudiantRepository.deleteById(id);
        System.out.println("deleted successfuly");
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant assignEtudiantToDepartement(Long idEtudiant, Integer idDepartement) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        etudiant.setDepartement(departement);
        return  etudiantRepository.save(etudiant);
    }

     @Override
     @Transactional
     public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe) {
        Equipe eqp = equipeRepository.findById(idEquipe).orElse(null);
        Contrat cont = contratRepository.findById(idContrat).orElse(null);


        cont.setEtudiant(e);
        contratRepository.save(cont);


         Set<Equipe> equipes = new HashSet<>();
         equipes.add(eqp);
         e.setEquips(equipes);

       return  etudiantRepository.save(e);
    }
}
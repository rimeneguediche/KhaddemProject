package com.example.khaddemproject.Services;


import com.example.khaddemproject.Entites.Contrat;
import com.example.khaddemproject.Entites.Etudiant;
import com.example.khaddemproject.Repositorys.ContratRepository;
import com.example.khaddemproject.Repositorys.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImp implements IContratServices{


    ContratRepository contratRepository;
    private final EtudiantRepository etudiantRepository;

    @Override
    public List<Contrat> getALLContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);

    }

    @Override
    public Contrat getContratById(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }


    @Override
    public Contrat assignContratToEtudiant( Contrat ce, String nomE, String prenomE){
        Etudiant etudiant = etudiantRepository.findByNomEtudiantAndPrenomEtudiant( nomE , prenomE);
            if ( contratRepository.countByArchiveIsFalseAndEtudiant(etudiant)<5 ){
                ce.setEtudiant(etudiant);
                contratRepository.save(ce);
            }
            return ce;
        }
    
@Override
public Integer nbrContratsValides(Date startDate, Date endDate){
        return contratRepository.countByArchiveIsFalseAndDateDebutContratBetween(startDate,endDate);
}


}

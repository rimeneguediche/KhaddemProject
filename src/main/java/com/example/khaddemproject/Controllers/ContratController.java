package com.example.khaddemproject.Controllers;

import com.example.khaddemproject.Entites.Contrat;
import com.example.khaddemproject.Services.IContratServices;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@AllArgsConstructor
public class ContratController {

    IContratServices contratServices;

    @GetMapping("/getAllContrat")
    public List<Contrat> getAllContrat(){
        return contratServices.getALLContrat();
    }

    @GetMapping("getContrat/{idContrat}")
    public Contrat getContrat(@PathVariable Integer idContrat){return contratServices.getContratById(idContrat);}

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat c){return contratServices.addContrat(c);}

    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat c){return contratServices.updateContrat(c);}

    @DeleteMapping("deleteContrat/{idContrat}")
    public void deleteContrat(@PathVariable Integer idContrat){contratServices.deleteContrat(idContrat);}


    @PutMapping("/assignContratToEtudiant/{nomEtudiant}/{prenomEtudiant}")
    @ResponseBody
    public Contrat assignContratToEtudiant(@RequestBody Contrat ce, @PathVariable("nomEtudiant") String nomEtudiant ,  @PathVariable("prenomEtudiant") String prenomEtudiant ){
        return contratServices.assignContratToEtudiant(ce, nomEtudiant, prenomEtudiant);
    }

    @GetMapping("/countByArchive/{d1}/{d2}")
    Integer countContratsValides(@PathVariable("d1") @DateTimeFormat(pattern = "yyy-MM-dd") Date startDate,@PathVariable ("d2")@DateTimeFormat(pattern = "yyy-MM-dd")Date endDate){
        return contratServices.nbrContratsValides(startDate, endDate);
    }




}

package com.example.khaddemproject.Controllers;

import com.example.khaddemproject.Entites.Contrat;
import com.example.khaddemproject.Services.IContratServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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



}

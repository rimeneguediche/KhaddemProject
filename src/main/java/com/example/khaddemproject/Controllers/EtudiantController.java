package com.example.khaddemproject.Controllers;

import com.example.khaddemproject.Entites.Etudiant;
import com.example.khaddemproject.Services.IEtudiantServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping ("/Etudiant")
public class EtudiantController {

    private final IEtudiantServices etudiantServices;

    @GetMapping("/getAllEtudiant")
    public List<Etudiant> getAllEtudiant() {
        return etudiantServices.getALLEtudiant();
    }


    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantServices.addEtudiant(e);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updatEtudiant(@RequestBody Etudiant e) {
        return etudiantServices.updateEtudiant(e);
    }

    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    void deleteETudiant(@PathVariable Long idEtudiant) {
        etudiantServices.deleteETudiant(idEtudiant);
    }

    @GetMapping("/getEtudiant/{idEtudiant}")
    public Etudiant getEtudiant(@PathVariable Long idEtudiant) {
        return etudiantServices.getEtudiantById(idEtudiant);
    }


    @PutMapping("/assignEtudiantToDepartement/{idEtudiant}/{idDepartement}")
    public Etudiant assignEtudiantToDepartement(@PathVariable Long idEtudiant,@PathVariable Integer idDepartement){
        return etudiantServices.assignEtudiantToDepartement(idEtudiant,idDepartement);
    }


    @PutMapping("/addAndAssignEtudiantToEquipeAndContract/{idEquipe}/{idContrat}")
    @ResponseBody
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable("idEquipe") Integer idEquipe ,@PathVariable("idContrat") Integer idContrat){
        return etudiantServices.addAndAssignEtudiantToEquipeAndContract(e,idEquipe,idContrat);

    }

}

package tn.esprit.ski.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Sevices.IMoniteurServices;
import tn.esprit.ski.entities.Moniteur;

import java.util.List;

@RestController
@RequestMapping("/moniteur")
@RequiredArgsConstructor

public class MoniteurController {
    final IMoniteurServices moniteurServices;
    @GetMapping("/retrieveAllMoniteurs")
    public List<Moniteur> retrieveAllMoniteurs(){
       return moniteurServices.retrieveAllMoniteurs();

    }
    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurServices.addMoniteur(moniteur);
    }
    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur){
        return moniteurServices.updateMoniteur(moniteur);
    }

    @GetMapping("/retrieveMoniteur")
    public Moniteur retrieveMoniteur(@RequestParam Long numMoniteur){
       return moniteurServices.retrieveMoniteur(numMoniteur);
    }



}

package tn.esprit.ski.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Sevices.ISkieurServices;
import tn.esprit.ski.entities.Inscreption;
import tn.esprit.ski.entities.Skieur;

import java.util.List;

@RestController
@RequestMapping("/skieur")
@RequiredArgsConstructor
public class SkieurController {
    final ISkieurServices  skieurServices;

    @GetMapping("/retrieveAllSkieurs")
    public List<Skieur> retrieveAllSkieurs(){
        return skieurServices.retrieveAllSkieurs();
    }

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur){
       return skieurServices.addSkieur(skieur);
    }

    @DeleteMapping("/removeSkieur")
    public void removeSkieur(@RequestParam Long numSkieur) {
         skieurServices.removeSkieur(numSkieur);
    }

    @GetMapping("/retrieveSkieur")
    public Skieur retrieveSkieur(@RequestParam Long numSkieur) {
        return skieurServices.retrieveSkieur(numSkieur);
    }

    @PostMapping("/addRegistrationAndAssignToSkier")
    public Inscreption addRegistrationAndAssignToSkier(@RequestBody Inscreption inscription, @RequestParam Long numSkieur){
     return  skieurServices.addRegistrationAndAssignToSkier(inscription,numSkieur) ;
    }



    }

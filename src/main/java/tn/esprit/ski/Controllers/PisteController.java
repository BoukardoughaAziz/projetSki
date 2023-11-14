package tn.esprit.ski.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Sevices.IPisteServices;
import tn.esprit.ski.entities.Piste;

import java.util.List;

@RestController
@RequestMapping("/Piste")
@RequiredArgsConstructor
public class PisteController {
    final IPisteServices pisteServices;

    @GetMapping("/retrieveAllPistes")
        public List<Piste> retrieveAllPistes(){
        return pisteServices.retrieveAllPistes();
    }

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste){
        return pisteServices.addPiste(piste);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste){
        return pisteServices.updatePiste(piste);
    }

    @GetMapping("/retrievePiste")
    public Piste retrievePiste(@RequestParam Long numPiste){
        return pisteServices.retrievePiste(numPiste);
    }







}

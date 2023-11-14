package tn.esprit.ski.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Sevices.ICoursServices;
import tn.esprit.ski.entities.Cours;

import java.util.List;

@RestController
@RequestMapping("/cours")
@RequiredArgsConstructor

public class CoursController {
    final ICoursServices coursServices;

    @GetMapping("/retrieveAllCourses")
    public List<Cours> retrieveAllCourses(){
        return coursServices.retrieveAllCourses();
    }

    @PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours cours){
        return coursServices.addCours(cours);
    }

    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours){
        return coursServices.updateCours(cours);
        }

    @GetMapping("/retrieveCours")
    public Cours retrieveCours(@RequestParam  Long numCours) {
        return coursServices.retrieveCours(numCours);
    }
}

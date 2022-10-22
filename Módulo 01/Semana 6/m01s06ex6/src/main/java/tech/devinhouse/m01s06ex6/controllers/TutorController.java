package tech.devinhouse.m01s06ex6.controllers;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m01s06ex6.models.Tutor;

@RestController
@RequestMapping(value="tutor")

public class TutorController {
    @GetMapping
    public String get(){
        return "Get - Tutor";
    }
    @PostMapping
    public Tutor post(@RequestBody Tutor tutor){
        return tutor;

    }
    @PutMapping
    public Tutor put(@RequestBody Tutor tutor){
        Tutor tutorEditado = findById(tutor.getId());
        return tutorEditado;
    }
    @DeleteMapping
    public String delete(){
        return "delete - tutor";
    }


}

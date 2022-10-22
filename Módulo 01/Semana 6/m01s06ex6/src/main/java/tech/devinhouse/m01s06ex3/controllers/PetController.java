package tech.devinhouse.m01s06ex3.controllers;


import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m01s06ex3.models.Pet;

@RestController
@RequestMapping(value="pet")
public class PetController {
    @GetMapping
    public String get(){

        return "Get - Pet";
    }

    @PostMapping
    public String post(){
        return "Post - Pet";
    }
    @PutMapping
    public String put(){
        return "Put - Pet";
    }
    @DeleteMapping
    public String delete(){
        return "Delete - Pet";
    }

}

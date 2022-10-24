package tech.devinhouse.m01s06ex3.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m01s06ex3.models.Pet;
import tech.devinhouse.m01s06ex3.repositories.PetRepository;

import java.util.List;

@RestController
@RequestMapping(value="pet")
public class PetController {
    @Autowired
    private PetRepository petRepository;
    @GetMapping
    public List<Pet> get(){
        return petRepository.findAll();
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet){
        return petRepository.save(pet);
    }
    @PutMapping
    public Pet put(@RequestBody Pet pet){
        return petRepository.save(pet);
    }
    @DeleteMapping
    public boolean delete(Integer id){
        return petRepository.delete(id);
    }




}

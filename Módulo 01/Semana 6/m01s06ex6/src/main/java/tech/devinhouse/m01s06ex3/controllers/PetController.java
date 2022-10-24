package tech.devinhouse.m01s06ex3.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m01s06ex3.models.Pet;
import tech.devinhouse.m01s06ex3.repositories.PetRepository;
import tech.devinhouse.m01s06ex3.services.PetService;

import java.util.List;

@RestController
@RequestMapping(value="pet")
public class PetController {
    @Autowired
    private PetService petService;
    @GetMapping
    public List<Pet> get(){
        return petService.findAll();
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet){
        return petService.save(pet);
    }
    @PutMapping
    public Pet put(@RequestBody Pet pet){
        return petService.save(pet);
    }
    @DeleteMapping
    public boolean delete(Integer id){
        return petService.delete(id);
    }




}

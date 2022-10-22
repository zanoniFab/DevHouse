package tech.devinhouse.m01s06ex3.controllers;


import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m01s06ex3.models.Pet;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="pet")
public class PetController {
    private static List<Pet> pets = new ArrayList();
    @GetMapping
    public List<Pet> get(){
        return pets;
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet){
        pets.add(pet);
        return pet;
    }
    @PutMapping
    public Pet put(@RequestBody Pet pet){
        Pet petEditacao = findById(pet.getId());
        petEditacao.setNome(pet.getNome());
        petEditacao.setTipo(pet.getTipo());
        petEditacao.setRaca(pet.getRaca());
        petEditacao.setIdade(pet.getIdade());
        petEditacao.setAlimentoPreferido(pet.getAlimentoPreferido());

        return petEditacao;
    }
    @DeleteMapping
    public boolean delete(Integer id){
        try{
            Pet pet = findById(id);
            pets.remove(pet);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    private Pet findById(Integer id){
        for (Pet pet : pets){
            if(id == pet.getId()){
                return pet;
            }
        }
        return null;
    }


}

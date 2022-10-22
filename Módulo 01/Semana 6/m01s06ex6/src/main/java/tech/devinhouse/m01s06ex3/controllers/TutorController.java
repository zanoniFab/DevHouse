package tech.devinhouse.m01s06ex3.controllers;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m01s06ex3.models.Pet;
import tech.devinhouse.m01s06ex3.models.Tutor;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="tutor")

public class TutorController {
    private static List<Tutor> tutores = new ArrayList<>();
    @GetMapping
    public List<Tutor> get(){
        return tutores;
    }
    @PostMapping
    public Tutor post(@RequestBody Tutor tutor){
        tutores.add(tutor);
        return tutor;

    }
    @PutMapping
    public Tutor put(@RequestBody Tutor tutor){
        Tutor tutorEdicao = findById(tutor.getId());
        tutorEdicao.setNome(tutor.getNome());
        tutorEdicao.setIdade(tutor.getIdade());
        return tutorEdicao;
    }

    @DeleteMapping
    public boolean delete(Integer id){
        try{
            Tutor tutor = findById(id);
            tutores.remove(tutor);
        } catch (Exception e){
            return false;
        }
        return true;
    }
    private Tutor findById(Integer id){
        for (Tutor tutor : tutores){
            if(id == tutor.getId()){
                return tutor;
            }
        }
        return null;
    }

}

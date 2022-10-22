package tech.devinhouse.m01s06ex3.controllers;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.m01s06ex3.models.Tutor;

@RestController
@RequestMapping(value="tutor")

public class TutorController {
    @GetMapping
    public String get(){
        return "Get - Tutor";
    }
    @PostMapping
    public String post(){
        return "Post - Tutor";

    }
    @PutMapping
    public String put(  ){
        return "Put - Tutor";
    }
    @DeleteMapping
    public String delete(){
        return "delete - tutor";
    }


}

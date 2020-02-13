package com.DevTraining.Mission2.Controller;


import com.DevTraining.Mission2.Model.*;
import com.DevTraining.Mission2.Service.PostService;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.DevTraining.Mission2.Model.GetPetResponse;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class Controller {

    PostService postService;

    public Controller (PostService postService){
        this.postService=postService;
    }
    @GetMapping("/{id}")
    public GetPetResponse getValue(@PathVariable(value="id") int id){
        return postService.getPet(id);
    }

    @PostMapping
    public String createResponse(@RequestBody PostPetRequest postPetRequest){

        return postService.savePet(postPetRequest);
    }
    @PutMapping("/{id}")
    public String updateResponse(@PathVariable(value="id") int id, @RequestBody PutPetRequest putPetRequest){

        return postService.updatePet(id, putPetRequest);
    }
    @DeleteMapping("/{id}")
    public String deleteResponse(@PathVariable(value= "id") int id){
        return postService.deletePet(id);
    }

}



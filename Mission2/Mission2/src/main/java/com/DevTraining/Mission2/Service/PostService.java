package com.DevTraining.Mission2.Service;

import com.DevTraining.Mission2.Model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {

   private static List<PetEntity> strings = new ArrayList<>();

    public PostService(List<PetEntity> strings) {
        this.strings = strings;
    }

//    public List<PetEntity> strings = savePet()
    public String savePet(PostPetRequest postPetRequest){
//       petEntities.add(new PetEntity(postPetRequest.getPet(), postPetRequest.getSpecies(), postPetRequest.getGender(), postPetRequest.getAge()));
        strings.add(new PetEntity(postPetRequest.getPet(), postPetRequest.getType(), postPetRequest.getGender(), postPetRequest.getAge(), null));

        return "Created and saved";
    }

    public GetPetResponse getPet(int id){
        GetPetResponse pet= new GetPetResponse();
        pet.setPet(strings.get(id).getPet());
        pet.setType(strings.get(id).getType());
        pet.setGender(strings.get(id).getGender());
        pet.setAge(strings.get(id).getAge());
        pet.setIsFavourite(strings.get(id).getIsFavourite());

        return pet;
    }
    public String updatePet(int id, PutPetRequest putPetRequest){
        strings.set(id, new PetEntity(putPetRequest.getPet(), putPetRequest.getType(), putPetRequest.getGender(), putPetRequest.getAge(), putPetRequest.getIsFavourite()));
        return "Updated";
    }

    public String deletePet(int id){
        strings.remove(id);
        return "Deleted";
    }

}

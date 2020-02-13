package com.DevTraining.Mission2.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PutPetRequest {
    String pet;
    String type;
    String gender;
    Integer age;
    Boolean isFavourite;

}


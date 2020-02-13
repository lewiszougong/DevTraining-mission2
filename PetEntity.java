package com.DevTraining.Mission2.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class PetEntity {
   // @Id
    private String pet;
    private String type;
    private String gender;
    private Integer age;
    private Boolean isFavourite;

    public PetEntity(String pet, String type, String gender, Integer age, Boolean isFavourite){
        this.pet=pet;
        this.type=type;
        this.gender=gender;
        this.age=age;
        this.isFavourite=isFavourite;

    }

    @Override
    public String toString() {
        return "Config{" +
                ", Pet='" + pet + '\'' +
                ", Type='" + type + '\'' +
                ", Gender='" + gender + '\'' +
                ", Age='" + age + '\'' +
                '}';
    }
}

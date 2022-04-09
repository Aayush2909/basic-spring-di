package com.springframework.pets;

public class PetServiceFactory {

    public PetService getPetService(String petType){
        return switch (petType) {
            case "dog" -> new DogPetService();
            case "cat" -> new CatPetService();
            default -> new OtherPetService();
        };
    }
}

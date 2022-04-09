package com.springframework.basicspringdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(@Qualifier("otherPetService") PetService petService) {
        this.petService = petService;
    }

    public String getBestPet() {
        return petService.getPetType();
    }
}

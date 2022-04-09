package com.springframework.pets;

public class OtherPetService implements PetService {

    @Override
    public String getPetType() {
        return "Others are cool too!!!";
    }
}

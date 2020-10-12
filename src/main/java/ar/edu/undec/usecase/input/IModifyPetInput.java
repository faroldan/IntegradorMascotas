package ar.edu.undec.usecase.input;

import ar.edu.undec.pets.Pet;

public interface IModifyPetInput {

    boolean modifyPet(Pet pet, String newName);
}

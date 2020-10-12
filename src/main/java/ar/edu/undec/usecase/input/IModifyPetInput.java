package ar.edu.undec.usecase.input;

import ar.edu.undec.domain.Pet;

public interface IModifyPetInput {

    boolean modifyPet(Pet pet, String newName);
}

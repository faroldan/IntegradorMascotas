package ar.edu.undec.usecase;

import ar.edu.undec.domain.Pet;
import ar.edu.undec.repository.IModifyClientRepository;
import ar.edu.undec.repository.IModifyPetRepository;
import ar.edu.undec.usecase.input.IModifyPetInput;

public class ModifyPetUseCase implements IModifyPetInput {

    private IModifyPetRepository modifyPetRepo;

    public ModifyPetUseCase(IModifyPetRepository modifyPetRepo) {

        this.modifyPetRepo=modifyPetRepo;
    }


    @Override
    public boolean modifyPet(Pet pet, String pName) {
        if(!modifyPetRepo.isTheSame(pName)){

            pet.setName(pName);
            return true;
        }else{
        return false;
        }
    }
}

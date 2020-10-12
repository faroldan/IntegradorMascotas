package ar.edu.undec.usecase;

import ar.edu.undec.domain.Pet;
import ar.edu.undec.repository.ICreatePetRepository;
import ar.edu.undec.usecase.input.ICreatePetInput;

public class CreatePetUseCase implements ICreatePetInput {


    private ICreatePetRepository createPetRepo;

    public CreatePetUseCase(ICreatePetRepository createPetRepo) {

        this.createPetRepo = createPetRepo;
    }

    @Override
    public boolean createPet(Pet pet) {
        if(createPetRepo.exist(pet.getName())){

            return false;
        }else {
            createPetRepo.savePet(pet);
            return true;
        }
    }
}

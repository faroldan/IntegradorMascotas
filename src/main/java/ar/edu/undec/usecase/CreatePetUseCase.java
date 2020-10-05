package ar.edu.undec.usecase;

import ar.edu.undec.repository.ICreatePetRepository;

public class CreatePetUseCase {


    private ICreatePetRepository createPetRepo;

    public CreatePetUseCase(ICreatePetRepository createPetRepo) {

        this.createPetRepo = createPetRepo;
    }
}

package ar.edu.undec.usecase;

import ar.edu.undec.repository.IConsultPetRepository;
import ar.edu.undec.usecase.input.IConsultPetInput;
import ar.edu.undec.usecase.input.ICreatePetInput;

public class ConsultPetUseCase implements IConsultPetInput {
    private IConsultPetRepository consultPetRepo;
    public ConsultPetUseCase(IConsultPetRepository consultPetRepo) {
        this.consultPetRepo = consultPetRepo;
    }
}

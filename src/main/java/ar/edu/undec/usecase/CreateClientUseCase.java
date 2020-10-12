package ar.edu.undec.usecase;

import ar.edu.undec.domain.Client;
import ar.edu.undec.repository.ICreateClientRepository;
import ar.edu.undec.usecase.input.ICreateCustomerInput;


public class CreateClientUseCase implements ICreateCustomerInput {

    ICreateClientRepository createCustomerRepo;
    public CreateClientUseCase(ICreateClientRepository createCustomerRepo) {
        this.createCustomerRepo = createCustomerRepo;
    }

    @Override
    public boolean createClient(Client customer) {
        return false;
    }
}

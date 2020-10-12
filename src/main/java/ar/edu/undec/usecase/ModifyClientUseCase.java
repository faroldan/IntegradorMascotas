package ar.edu.undec.usecase;

import ar.edu.undec.domain.Client;
import ar.edu.undec.repository.IModifyClientRepository;
import ar.edu.undec.usecase.input.IModifyClientInput;


public class ModifyClientUseCase implements IModifyClientInput {
    private IModifyClientRepository modifyCustomerRepo;

    public ModifyClientUseCase(IModifyClientRepository modifyCustomerRepo) {
        this.modifyCustomerRepo= modifyCustomerRepo;
    }


    @Override
    public boolean modifyClient(Client customer) {
        if(!modifyCustomerRepo.isTheSame(customer)){

            customer.setFname(customer.getFname());
            return true;
        }else{
            return false;
        }
    }
}

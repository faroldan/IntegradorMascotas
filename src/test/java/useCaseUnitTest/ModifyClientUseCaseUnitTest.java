package useCaseUnitTest;

import ar.edu.undec.domain.Client;
import ar.edu.undec.domain.MockitoExtension;
import ar.edu.undec.domain.Pet;
import ar.edu.undec.repository.ICreatePetRepository;
import ar.edu.undec.repository.IModifyClientRepository;
import ar.edu.undec.usecase.CreatePetUseCase;
import ar.edu.undec.usecase.ModifyClientUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ModifyClientUseCaseUnitTest {

    IModifyClientRepository modifyCustomerRepo;
    private ICreatePetRepository createPetRepo;

    @Test
    void ModifyClientUseCaseUnitTest() {


        //arrange
        Client customer = Client.instancia("McCarthy", "William", 235627,
                LocalDate.of(1859, 9, 17));
        Pet pet_1 = Pet.instancia("CanCerberus", "StreetGuardian", LocalDate.of(2017, 4, 1));
        CreatePetUseCase petCase = new CreatePetUseCase(createPetRepo);

        ModifyClientUseCase customerModifCase = new ModifyClientUseCase(modifyCustomerRepo);


       /* when(customerModifCase.modifyClient(customer)).thenReturn(true);


        //Act
        boolean result=modifyCustomerRepo.changed(customer);

        //Assert
        Assertions.assertTrue(result);*/

    }
}
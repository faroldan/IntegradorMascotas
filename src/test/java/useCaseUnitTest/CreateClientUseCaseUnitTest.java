package useCaseUnitTest;

import ar.edu.undec.domain.Client;
import ar.edu.undec.domain.MockitoExtension;
import ar.edu.undec.repository.ICreateClientRepository;
import ar.edu.undec.usecase.CreateClientUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CreateClientUseCaseUnitTest {

    ICreateClientRepository createCustomerRepo;
    @Test
    void ClientCreationTest(){

        //arrange
        Client customer =  Client.instancia("McCarthy", "William", 235627,
                LocalDate.of(1859, 9, 17));
        CreateClientUseCase clientCase=new CreateClientUseCase(createCustomerRepo);

        //actual

        /*when(createCustomerRepo.exist(customer.getFname())).thenReturn(false);
        when(createCustomerRepo.saveCustomer(customer)).thenReturn(true);

        //Act
        boolean result=clientCase.createClient(customer);

        //Assert
        Assertions.assertTrue(result);*/

    }
}

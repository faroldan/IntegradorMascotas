package useCaseUnitTest;
import ar.edu.undec.domain.MockitoExtension;
import ar.edu.undec.domain.Pet;
import ar.edu.undec.repository.ICreatePetRepository;
import ar.edu.undec.usecase.CreatePetUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CreatePetUseCaseUnitTest{

    ICreatePetRepository createPetRepo;

    @Test
    void PetCreationTest() {
        //arrange
        Pet pet =  Pet.instancia("WildStallion", "GermanShupurd", LocalDate.of(2018, 1, 1));
        CreatePetUseCase petCase = new CreatePetUseCase(createPetRepo);


        when(createPetRepo.exist(pet.getName())).thenReturn(false);
        when(createPetRepo.savePet(pet)).thenReturn(true);

        //Act
        boolean result=petCase.createPet(pet);

        //Assert
        Assertions.assertTrue(result);

    }

}

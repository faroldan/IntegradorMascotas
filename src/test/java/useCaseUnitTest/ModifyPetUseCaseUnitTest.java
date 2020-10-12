package useCaseUnitTest;

import ar.edu.undec.domain.MockitoExtension;
import ar.edu.undec.domain.Pet;
import ar.edu.undec.repository.ICreatePetRepository;
import ar.edu.undec.repository.IModifyPetRepository;
import ar.edu.undec.usecase.ModifyPetUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ModifyPetUseCaseUnitTest {

    IModifyPetRepository modifyPetRepo;
    private ICreatePetRepository createPetRepo;

    @Test
    void ModifyPetTest(){
        //arrange
        Pet pet =  Pet.instancia("WildStallion", "GermanShupurd", LocalDate.of(2018, 1, 1));
        Pet pet_1 =  Pet.instancia("CanCerberus", "StreetGuardian", LocalDate.of(2017, 4, 1));
        //CreatePetUseCase petCase = new CreatePetUseCase(createPetRepo);
        ModifyPetUseCase petModifCase= new ModifyPetUseCase(modifyPetRepo);


        when(petModifCase.modifyPet(pet_1,"Cerberus")).thenReturn(true);
        //when(.savePet(pet)).thenReturn(true);

        //Act
        boolean result=modifyPetRepo.changed(pet_1);

        //Assert
        Assertions.assertTrue(result);


    }
}

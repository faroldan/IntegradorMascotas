package useCaseUnitTest;
import ar.edu.undec.pets.MockitoExtension;
import ar.edu.undec.pets.Pet;
import ar.edu.undec.usecase.CreatePetUseCase;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CreatePetUseCaseUnitTest{
    Pet pet =  new Pet("WildStallion", "GermanShupurd", LocalDate.of(2018,1,1));
   // CreatePetUseCaseeCase petCase =

}

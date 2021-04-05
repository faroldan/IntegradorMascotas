package useCaseUnitTest;

import ar.edu.undec.domain.MockitoExtension;
import ar.edu.undec.domain.Pet;
import ar.edu.undec.repository.IConsultPetRepository;
import ar.edu.undec.repository.ICreatePetRepository;
import ar.edu.undec.usecase.ConsultPetUseCase;
import ar.edu.undec.usecase.CreatePetUseCase;
import ar.edu.undec.usecase.ModifyPetUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsultPetUseCaseUnitTest {

    IConsultPetRepository consultPetRepo;
    @Test
    void ConsultPetTest(){

        //arrange
        Pet pet =  Pet.instancia("WildStallion", "GermanShupurd", LocalDate.of(2018, 1, 1));
        Pet pet_1 =  Pet.instancia("CanCerberus", "StreetGuardian", LocalDate.of(2017, 4, 1));

        ConsultPetUseCase petCase = new ConsultPetUseCase(consultPetRepo);

        when(consultPetRepo.isTheSame(pet_1)).thenReturn(true);

    }
}

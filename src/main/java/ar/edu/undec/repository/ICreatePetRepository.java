package ar.edu.undec.repository;

import ar.edu.undec.domain.Pet;

public interface ICreatePetRepository {

    boolean exist(String pet);
    boolean savePet(Pet pet);
}

package ar.edu.undec.repository;


import ar.edu.undec.domain.Pet;

public interface IModifyPetRepository {


    boolean changed(Pet pet);
    boolean isTheSame(String p);
}

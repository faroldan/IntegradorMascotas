package ar.edu.undec.repository;

import ar.edu.undec.domain.Client;
import ar.edu.undec.domain.Pet;

public interface IModifyClientRepository {
    boolean changed(Client customer);
    boolean isTheSame(Client customer);
}

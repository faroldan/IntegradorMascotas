package ar.edu.undec.repository;

import ar.edu.undec.domain.Client;

public interface ICreateClientRepository {
    boolean exist(String customer);
    boolean saveCustomer(Client customer);
}

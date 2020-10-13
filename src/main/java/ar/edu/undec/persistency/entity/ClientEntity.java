package ar.edu.undec.persistency.entity;

import ar.edu.undec.domain.Pet;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "pet")
@SequenceGenerator(name = "client_id_seq", initialValue = 1,sequenceName = "client_id_seq", allocationSize = 1)
public class ClientEntity {

    @Id
    @Column(name = "idclient")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id_seq")
    private Integer idclient;
    @Column(name="surname")
    private String surname;
    @Column(name="fname")
    private String fname;
    @Column(name="DNI")
    private Integer DNI;
    @Column(name="dob")
    private LocalDate DOB;

    @OneToMany( targetEntity= Pet.class )
    private List petlist;

    public ClientEntity() {
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public List getPetlist() {
        return petlist;
    }

    public void setPetlist(List petlist) {
        this.petlist = petlist;
    }
}

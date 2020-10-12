package ar.edu.undec.domain;

import java.time.LocalDate;

public class Client {
    private String surname;
    private String fname;
    private Integer DNI;
    private LocalDate DOB;


    private Client(String surname, String fname, Integer DNI, LocalDate DOB){
        this.surname=surname;
        this.fname=fname;
        this.DNI=DNI;
        this.DOB=DOB;
    }

    public static Client instancia(String surname, String fname, Integer DNI, LocalDate DOB){
        return new Client(surname, fname, DNI, DOB);
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

}

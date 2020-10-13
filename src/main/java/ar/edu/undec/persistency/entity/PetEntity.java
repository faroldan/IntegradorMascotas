package ar.edu.undec.persistency.entity;

import ar.edu.undec.domain.Client;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "pet")
@SequenceGenerator(name = "pet_id_seq", initialValue = 1,sequenceName = "pet_id_seq", allocationSize = 1)
public class PetEntity {

    @Id
    @Column(name = "idpet")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_id_seq")
    private Integer idpet;
    @Column(name="name")
    private String nombre;
    @Column(name="pedigree")
    private String raza;
    @Column(name="dob")
    private LocalDate fechaNacimiento;
    @ManyToOne
    private Client customer;

    public PetEntity() {
    }

    public Integer getIdpet() {
        return idpet;
    }

    public void setIdpet(Integer idpet) {
        this.idpet = idpet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

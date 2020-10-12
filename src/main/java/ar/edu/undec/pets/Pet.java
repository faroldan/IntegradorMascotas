package ar.edu.undec.pets;

import java.time.LocalDate;

public class Pet {

    private String nombre;
    private String raza;
    private LocalDate fechaNacimiento;


    private Pet(String nombre, String raza, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static Pet instancia(String nombre, String raza, LocalDate fechaNacimiento) {
    return new Pet(nombre, raza, fechaNacimiento);
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        nombre=name;
    }
}

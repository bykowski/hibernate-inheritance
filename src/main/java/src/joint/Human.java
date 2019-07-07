package src.joint;

import javax.persistence.Entity;

@Entity
public class Human extends Mammal {

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

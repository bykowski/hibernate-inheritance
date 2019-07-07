package src.joint;

import javax.persistence.Entity;

@Entity
public class Dog extends Mammal {

    private int tailSize;

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }
}

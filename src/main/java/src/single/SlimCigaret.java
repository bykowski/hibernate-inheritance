package src.single;

import javax.persistence.Entity;

@Entity
public class SlimCigaret extends Cigaret {

    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public SlimCigaret(int width) {
        this.width = width;
    }

    public SlimCigaret() {
    }
}

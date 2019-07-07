package src.single;

import javax.persistence.Entity;

@Entity
public class MentolCigaret extends Cigaret{

    private boolean isClickable;

    public boolean isClickable() {
        return isClickable;
    }

    public void setClickable(boolean clickable) {
        isClickable = clickable;
    }

    public MentolCigaret(boolean isClickable) {
        this.isClickable = isClickable;
    }

    public MentolCigaret() {
    }
}

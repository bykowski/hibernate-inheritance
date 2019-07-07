package src.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DarkBeer extends Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int darkPower;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDarkPower() {
        return darkPower;
    }

    public void setDarkPower(int darkPower) {
        this.darkPower = darkPower;
    }
}

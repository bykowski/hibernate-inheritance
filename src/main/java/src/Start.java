package src;

import src.Dao;
import src.joint.Dog;
import src.joint.Human;
import src.single.MentolCigaret;
import src.single.SlimCigaret;
import src.table.DarkBeer;
import src.table.LightBeer;

public class Start {


    public static void main(String[] args) {

        // JOINTED
//        Dog dog = new Dog();
//        dog.setTailSize(4);
//        dog.setName("Burosław");
//
//        Human human = new Human();
//        human.setName("Jan");
//        human.setSurname("Nowak");
//
//        Dao<Dog> dogDao = new Dao<>();
//        dogDao.save(dog);
//        Dao<Human> humanDao = new Dao<>();
//        humanDao.save(human);

        // SINGLE TABLE
//        MentolCigaret mentolCigaret = new MentolCigaret();
//        mentolCigaret.setClickable(true);
//        mentolCigaret.setName("LM");
//
//        SlimCigaret slimCigaret = new SlimCigaret(1);
//        slimCigaret.setName("Marlboro");
//
//        Dao<MentolCigaret> mentolCigaretDao = new Dao<>();
//        mentolCigaretDao.save(mentolCigaret);
//        Dao<SlimCigaret> slimCigaretDao = new Dao<>();
//        slimCigaretDao.save(slimCigaret);

        // TABLE PER CLASS
        DarkBeer darkBeer = new DarkBeer();
        darkBeer.setDarkPower(2);
        darkBeer.setName("Okocim premium");
        Dao<DarkBeer> darkBeerDao = new Dao<>();
        darkBeerDao.save(darkBeer);

        LightBeer lightBeer = new LightBeer();
        lightBeer.setLightPower(1);
        lightBeer.setName("Leszek Free");
        Dao<LightBeer> lightBeerDao = new Dao<>();
        lightBeerDao.save(lightBeer);



    }


}

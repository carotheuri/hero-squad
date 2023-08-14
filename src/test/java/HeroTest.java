import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    public void InstanceofHero() throws  Exception {
        ArrayList<Squad> squads = setUpSquads();
        Hero hero = new Hero("Superman","32",3,1,squads);
        Assertions.assertEquals(true, hero instanceof  Hero);
    }
    @Test
    public void HeroInstantiatesWithHeroName_true() throws Exception {
        ArrayList<Squad> squads = setUpSquads();
        Hero hero = new Hero("Superman","32",3,1,squads);
        Assertions.assertEquals("Superman", hero.getHero_name());
    }
    public ArrayList<Squad> setUpSquads(){
        Squad squad1 = new Squad(4,2,"WarFight","Fight all ongoing war, when negotiations are not working");
        Squad squad2 = new Squad(10,5,"WarDefense","Defend Citizens and Evacuate them for Safety");
        Squad squad3 = new Squad(3,3,"Drusco","Fight Drug Addiction and help citizens reform");
        Squad squad4 = new Squad(2,3,"Hungro","Eradicate hunger by carrying out different initiatives");
        ArrayList<Squad> squads = Squad.getAll();
        return squads;
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    public void InstanceofHero() throws  Exception {
        ArrayList<Squad> squads = setUpSquads();
        Hero hero = new Hero("Superman","32",3,1,1,squads);
        Assertions.assertEquals(true, hero instanceof  Hero);
    }
    @Test
    public void HeroInstantiatesWithHeroName_true() throws Exception {
        ArrayList<Squad> squads = setUpSquads();
        Hero hero = new Hero("Superman","32",3,1,2,squads);
        Assertions.assertEquals("Superman", hero.getHero_name());
    }
    @Test
    public void HeroScoreForSupport() throws Exception {
        ArrayList<Squad> squads = setUpSquads();
        Hero hero = new Hero("Superman","32",1,2,2,squads);
        Assertions.assertEquals("2nd Line Support", hero.getHero_Score());
    }
    @Test
    public void validateSquadMaxIsNotExceeded() {
        ArrayList<Squad> squads = setUpSquads();
        int squad_id = 4;
        int MaxSize = 0;
        int InitialSize = 0;
        int CurrentSize = 0;
        boolean isCurrentSizeEqualMaxSize = CurrentSize == MaxSize;
        for (Squad squad : squads) {
            if(squad.getId() == squad_id){
                MaxSize = squad.getMax_size();
                InitialSize = squad.getInitial_size();
            }
        }
        Hero hero = new Hero("Superman","32",1,1,squad_id ,squads);
        CurrentSize = InitialSize + 1;
        if(isCurrentSizeEqualMaxSize){
            Assertions.assertEquals(tr);
        }
        Hero hero2 = new Hero("Batman","32",1,1,squad_id ,squads);
        CurrentSize +=1;
        Assertions.assertEquals("true", CurrentSize);
    }

    public ArrayList<Squad> setUpSquads(){
        Squad squad1 = new Squad(4,2,"WarFight","Fight all ongoing war, when negotiations are not working");
        Squad squad2 = new Squad(10,5,"WarDefense","Defend Citizens and Evacuate them for Safety");
        Squad squad3 = new Squad(3,2,"Drusco","Fight Drug Addiction and help citizens reform");
        Squad squad4 = new Squad(3,1,"Hungro","Eradicate hunger by carrying out different initiatives");
        ArrayList<Squad> squads = Squad.getAll();
        return squads;
    }
}
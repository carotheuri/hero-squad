import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SquadTest {
    @Test
    public void InstanceofSquad() throws  Exception {
        Squad squad = setupNewSquad();
        Assertions.assertEquals(true, squad instanceof  Squad);
    }

//    @Test
//    public void validateSquadMaxIsNotExceeded() {
//        Squad squad1 = new Squad(4,3,"hungro","Eradicate hunger");
//        int newCount = squad1.getInitial_size()
//    }
//    @Test
//    public void validateHeroExistsInOneSquad() {
//        Squad squad1 = new Squad(4,3,"hungro","Eradicate hunger");
//        Squad squad2 = new Squad(4,3,"hungro","Eradicate hunger");
//        Squad squad3 = new Squad(4,3,"hungro","Eradicate hunger");
//        Squad squad4 = new Squad(4,3,"hungro","Eradicate hunger");
//        ArrayList<Squad> squads = Squad.getAll();
//        Map<String, Integer> nameCount = new HashMap<>();
//        for (Squad squad : squads) {
//            nameCount.put(squad.getSquad_name(), nameCount.getOrDefault(squad.getSquad_name(), 0) + 1);
//        }
//
//        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
//            Assertions.assertTrue(entry.getValue() <= 1, "Property 'name' appears more than once: " + entry.getKey());
//        }
//    }
    @Test
    public void AllSquadsContainsAllSquads_true() throws Exception {
        Squad squad1 = setupNewSquad();
        Squad squad2 = new Squad(4,3,"hungro","Eradicate hunger");
        List<Squad> squads = Squad.getAll();
        Assertions.assertEquals(2, squads.size());
//        Assertions.assertTrue(Squad.getAll().contains(squad1));
//        Assertions.assertTrue(Squad.getAll().contains(squad2));
    }

    public Squad setupNewSquad(){

        return new Squad(4,3,"hungro","Eradicate hunger");
    }
}
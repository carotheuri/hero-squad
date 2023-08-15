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
    @Test
    public void AllSquadsContainsAllSquads_true() throws Exception {
        Squad squad1 = setupNewSquad();
        Squad squad2 = new Squad(4,"hungro","Eradicate hunger");
        Assertions.assertTrue(Squad.getAll().contains(squad1));
        Assertions.assertTrue(Squad.getAll().contains(squad2));
    }
    @Test
    public void SquadInstantiatesWithSquadName_true() throws Exception {
        Squad squad = setupNewSquad();
        Assertions.assertEquals("hungro", squad.getSquad_name());
    }
    @Test
    public void SquadFindByI() throws Exception {
        Squad squad1 = new Squad(4,"WarFight","Fight all ongoing war, when negotiations are not working");
        Squad squad2 = new Squad(10,"WarDefense","Defend Citizens and Evacuate them for Safety");
        Squad squad3 = new Squad(3,"Drusco","Fight Drug Addiction and help citizens reform");
        Squad squad4 = new Squad(3,"Hungro","Eradicate hunger by carrying out different initiatives");
        Squad foundSquad = Squad.findById(1);
        Assertions.assertEquals("Drusco", squad3.getSquad_name());
    }

    public Squad setupNewSquad(){

        return new Squad(4,"hungro","Eradicate hunger");
    }
}
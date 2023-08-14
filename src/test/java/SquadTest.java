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

    public Squad setupNewSquad(){

        return new Squad(4,"hungro","Eradicate hunger");
    }
}
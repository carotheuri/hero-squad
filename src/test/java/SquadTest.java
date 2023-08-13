import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquadTest {
    @Test
    public void InstanceofSquad() throws  Exception {
        Squad squad = setupNewSquad();
        Assertions.assertEquals(true, squad instanceof  Squad);
    }

    public Squad setupNewSquad(){

        return new Squad(4,3,"hungro","Eradicate hunger");
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

// Branch Darts_FINAL
public class DartsTest {
    //branch DARTS_INITIAL
    private Darts dartBoard;

    @Before
    public void setUpGame(){

        dartBoard = new Darts();
    }
    //DartsTest class in MASTER
    //New Comment



    //branch darts_final

    //branch DARTS_INITIAL

    @Test
    public void testANewGameStart301(){
        assertEquals(301, dartBoard.score());
        assertFalse(dartBoard.isFinished());
    }


    @Test
    public void testANewGameHasCorrectNumberOfDartsAndTurn(){
        assertEquals(3, dartBoard.dartsLeft());
        assertEquals(1, dartBoard.turn());
    }


}

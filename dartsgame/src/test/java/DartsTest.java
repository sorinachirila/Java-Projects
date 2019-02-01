import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DartsTest {

    private Darts dartsBoard;

    @Before
    public void setUp(){
        dartsBoard = new Darts();
    }

    @Test
    public void testANewGameStart301(){
        assertEquals(301, dartsBoard.score());
        assertFalse(dartsBoard.isFinished());
    }

    @Test
    public void testANewGameHasCorrectNumberOfDartsAndTurn(){
        assertEquals(3, dartsBoard.dartsLeft());
        assertEquals(1, dartsBoard.turn());
    }

    @Test
    public void testScoreAfterSimpleThrow(){
        dartsBoard.darts(20);
        assertEquals(281, dartsBoard.score());
    }
    @Test
    public void testScoreAfterDoubleThrow(){
        dartsBoard.darts(20, Darts.Multiplier.DOUBLE);
        assertEquals(261, dartsBoard.score());
    }
    @Test
    public void testScoreAfterTripleThrow(){
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        assertEquals(241, dartsBoard.score());
    }

    @Test
    public void testScoreAfterUnknownThrow(){
        dartsBoard.darts(20, Darts.Multiplier.XX);
        assertEquals(281, dartsBoard.score());
    }

    @Test
    public void testDartsLeftAndTurnAreUpdatedCorrectly(){
        dartsBoard.darts(1);
        assertEquals(2, dartsBoard.dartsLeft());
        assertEquals(1, dartsBoard.turn());

        dartsBoard.darts(1);
        assertEquals(1, dartsBoard.dartsLeft());
        assertEquals(1, dartsBoard.turn());

        dartsBoard.darts(1);
        assertEquals(3, dartsBoard.dartsLeft()); //tura e terminata si se face update la dartsLeft si la turn
        assertEquals(2, dartsBoard.turn());

    }

    @Test
    public void testGameIsFinished(){
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        assertEquals(121, dartsBoard.score());
        assertEquals(2, dartsBoard.turn());

        dartsBoard.darts(17, Darts.Multiplier.TRIPLE); //70
        dartsBoard.darts(50);//20
        dartsBoard.darts(10, Darts.Multiplier.DOUBLE);
        assertEquals(0, dartsBoard.score());
        assertTrue(dartsBoard.isFinished());
    }

    @Test
    public void testIfBustBellowZero(){
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        assertEquals(121, dartsBoard.score());
        assertEquals(2, dartsBoard.turn());


        dartsBoard.darts(17, Darts.Multiplier.TRIPLE); //70
        dartsBoard.darts(17, Darts.Multiplier.TRIPLE); //19
        dartsBoard.darts(10, Darts.Multiplier.DOUBLE); //-1 Bust!
        assertEquals(121, dartsBoard.score()); //se pune scorul de la runda anterioara
        assertEquals(3, dartsBoard.turn());//increment
        assertEquals(3, dartsBoard.dartsLeft());//se reseteaza

    }

    @Test
    public void testIfBustScoringOne(){
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        assertEquals(121, dartsBoard.score());
        assertEquals(2, dartsBoard.turn());

        dartsBoard.darts(17, Darts.Multiplier.TRIPLE); //70
        dartsBoard.darts(17, Darts.Multiplier.TRIPLE); //19
        dartsBoard.darts(9, Darts.Multiplier.DOUBLE); //1
        assertEquals(121, dartsBoard.score()); //se pune scorul de la runda anterioara
        assertEquals(3, dartsBoard.turn());//increment
        assertEquals(3, dartsBoard.dartsLeft());//se reseteaza

    }
    @Test
    public void testIfBustScoringZeroWithoutDouble(){
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        dartsBoard.darts(20, Darts.Multiplier.TRIPLE);
        assertEquals(121, dartsBoard.score());
        assertEquals(2, dartsBoard.turn());

        dartsBoard.darts(17, Darts.Multiplier.TRIPLE); //70
        dartsBoard.darts(50);//20
        dartsBoard.darts(20);//0, fara DOUBLE Bust!
        assertEquals(121, dartsBoard.score());//currentScore devine, scorul de la runda anterioara

    }


}

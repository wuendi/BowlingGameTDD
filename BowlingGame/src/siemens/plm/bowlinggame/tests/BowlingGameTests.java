package siemens.plm.bowlinggame.tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingGameTests {

	@Test
	public void givenTwenty0sBowled_WhenGameScoreCalculated_ShouldBe0()
	{
        BowlingGame game = new BowlingGame();
        for ( int i=0; i< 20; i++ )
        {
        	game.roll (0);
        }
        assertEquals(game.score(), 0);
	}
	
	@Test
	public void Twenty1sBowled_WhenGameScoreCalculated_ShouldBe20()
	{
		BowlingGame game = new BowlingGame();
        for ( int i=0; i< 20; i++ )
        {
        	game.roll (1);
        }
        
        assertEquals(game.score(), 20);
	}
}

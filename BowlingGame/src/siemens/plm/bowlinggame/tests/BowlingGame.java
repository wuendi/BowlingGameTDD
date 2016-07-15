package siemens.plm.bowlinggame.tests;

public class BowlingGame  
{
    private int m_pins = 0;
    
	
	public BowlingGame ()
    {
    	
    }

    public void roll ( int pins )
    {
    	m_pins = m_pins + pins;
    }
    
    public int score ()
    {
    	return 1 * m_pins;
    }
}

package terning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class TestTheDice {

	@RepeatedTest(100)
	public void test() {
	Dice testDice = new Dice();
	
	int roll = testDice.roll();
	
	assertTrue(roll<= 6 && roll >= 1);
		
	}

}

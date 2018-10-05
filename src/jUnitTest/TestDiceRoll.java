package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import terning.Dice;

public class TestDiceRoll {

	@RepeatedTest(100)
	public void test() {
	Dice testDice = new Dice();
	
	int roll = testDice.roll();
	
	assertTrue(roll<= 6 && roll >= 1);
		
	}

}

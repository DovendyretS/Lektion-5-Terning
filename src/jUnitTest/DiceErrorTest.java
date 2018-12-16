package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import terning.Dice;

public class DiceErrorTest {

	@RepeatedTest(30)
	public void test() {
		Dice testDice = new Dice();
		final int totalRolls = 60000;
		final int lowRolls = (int)((totalRolls / 6) * 0.96);
		final int highRolls = (int)((totalRolls / 6) * 1.04);
		
		int roll;
		int et = 0;
		int to = 0;
		int tre = 0;
		int fire = 0;
		int fem = 0;
		int seks = 0;

        for (int i=0; i< totalRolls; i++){
        	roll = testDice.roll();
        	switch (roll){
                case 1:
                    et++;
                    break;
                case 2:
                    to++;
                    break;
                case 3:
                    tre++;
                    break;
                case 4:
                    fire++;
                    break;
                case 5:
                    fem++;
                    break;
                case 6:
                    seks++;
                    break;
            }
        }
        
        assertTrue(lowRolls <= et && et <= highRolls, "fejl ved et der var " + et + " et");
        assertTrue(lowRolls <= to && to <= highRolls, "fejl ved to der var " + to + " to");
        assertTrue(lowRolls <= tre && tre <= highRolls, "fejl ved tre der var " + tre + " tre");
        assertTrue(lowRolls <= fire && fire <= highRolls, "fejl ved fire der var " + fire + " fire");
        assertTrue(lowRolls <= fem && fem <= highRolls, "fejl ved fem der var " + fem + " fem");
        assertTrue(lowRolls <= seks && seks <= highRolls, "fejl ved seks der var " + seks + " seks");
	}
}

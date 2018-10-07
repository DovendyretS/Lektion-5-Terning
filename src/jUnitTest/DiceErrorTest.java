package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import terning.Dice;

public class DiceErrorTest {

	@Test
	public void test() {
		Dice testDice = new Dice();
		int roll = testDice.roll();
		int et = 0;
		int to = 0;
		int tre = 0;
		int fire = 0;
		int fem = 0;
		int seks = 0;

        for (int i=0; i<60000; i++){
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

	}

}

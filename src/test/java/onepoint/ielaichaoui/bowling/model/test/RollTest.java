package onepoint.ielaichaoui.bowling.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import onepoint.ielaichaoui.bowling.converter.RollConverter;
import onepoint.ielaichaoui.bowling.model.Roll;

public class RollTest {
	private Roll roll;
	private Map<String,Integer> expectedRollsWithScores;
	private RollConverter rollConverter;
	
	@Before
	public void prepareTest() {
		roll = new Roll();
		expectedRollsWithScores = new HashMap<>();
		expectedRollsWithScores.put("34",7);
		expectedRollsWithScores.put("9-",9);
		expectedRollsWithScores.put("-9",9);
		rollConverter = new RollConverter();
	}
	
	@Test
	public void rollTest() {
		for(String rollString: expectedRollsWithScores.keySet()) {
			roll = rollConverter.convertToTarget(rollString);
			assertNotNull(roll);
			int rollScore = roll.getScore();
			int expectedScore = expectedRollsWithScores.get(rollString);
			assertEquals(expectedScore, rollScore);
		}
	}
}

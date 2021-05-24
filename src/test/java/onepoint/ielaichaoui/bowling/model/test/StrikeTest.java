package onepoint.ielaichaoui.bowling.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import onepoint.ielaichaoui.bowling.converter.StrikeConverter;
import onepoint.ielaichaoui.bowling.model.Strike;

public class StrikeTest {
	private Strike strike;
	private List<String> expectedStrikes;
	private StrikeConverter strikeConverter;
	
	@Before
	public void prepareTest() {
		strike = new Strike();
		expectedStrikes = new ArrayList<>();
		expectedStrikes.add("x");
		strikeConverter = new StrikeConverter();
	}
	
	@Test
	public void rollTest() {
		for(String strikeString: expectedStrikes) {
			strike = strikeConverter.convertToTarget(strikeString);
			assertNotNull(strike);
			int strikeScore = strike.getScore();
			int expectedScore = 10;
			assertEquals(expectedScore, strikeScore);
		}
	}
}

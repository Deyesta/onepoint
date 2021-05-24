package onepoint.ielaichaoui.bowling.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import onepoint.ielaichaoui.bowling.Frame;

public class FrameTest {
	
	private Frame frame;
	private Map<String,Integer> expectedFramesWithResults;
	
	@Before
	public void prepareTest() {
		frame = new Frame();
		expectedFramesWithResults = new HashMap<>();
		expectedFramesWithResults.put("x x x x x x x x x x x x", 300);
		expectedFramesWithResults.put("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-", 90);
		expectedFramesWithResults.put("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5", 150);
	}
	
	@Test
	public void bowlingTest() {
		for(String rolls : expectedFramesWithResults.keySet()) {
			int result =  frame.getScore(rolls);
			int expectedResult = expectedFramesWithResults.get(rolls);
			assertEquals(expectedResult,result);
		}
	}

}

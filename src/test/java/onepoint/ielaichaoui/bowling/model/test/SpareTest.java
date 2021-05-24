package onepoint.ielaichaoui.bowling.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import onepoint.ielaichaoui.bowling.converter.SpareConverter;
import onepoint.ielaichaoui.bowling.model.Spare;

public class SpareTest {
	private Spare spare;
	private List<String> expectedSpares;
	private SpareConverter spareConverter;
	
	@Before
	public void prepareTest() {
		spare = new Spare();
		expectedSpares = new ArrayList<>();
		expectedSpares.add("5/");
		spareConverter = new SpareConverter();
	}
	
	@Test
	public void rollTest() {
		for(String spareString: expectedSpares) {
			spare = spareConverter.convertToTarget(spareString);
			assertNotNull(spare);
			int spareScore = spare.getScore();
			int expectedScore = 10;
			assertEquals(expectedScore, spareScore);
		}
	}
}

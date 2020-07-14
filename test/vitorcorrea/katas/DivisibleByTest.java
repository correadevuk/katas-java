package vitorcorrea.katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleByTest {
	
	@Test
	public void checkIfNumberIsDivisibleByOther() {
		DivisibleBy test = new DivisibleBy();
		boolean result = test.checkIfDivisible(10, 2);
		assertTrue(result);
	}

}

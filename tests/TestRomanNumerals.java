import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		
		assertEquals(RomanNumerals.convertToInteger("X"),10);
		
		assertEquals(RomanNumerals.convertToInteger("CM"),900);
		
		assertTrue(RomanNumerals.convertToInteger("III")==3);
	}

}

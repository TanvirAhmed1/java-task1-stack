package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringStackArrayTest {

	@Test
	void test() {
		StringStackArray sas = new StringStackArray();
		sas.push("Woafi");
		sas.push("Tanvir");
		String expected = "Tanvir";
		String expected2 = "Woafi";
		String actual = sas.pop();
		String actual2 = sas.pop();
		assertEquals(expected, actual);
		assertEquals(expected2, actual2);
		StringStackArray sas2 = new StringStackArray();
		sas2.push("Shaha");
		sas2.push("Afroza");
		String expectedpeek = "Afroza";
		String expectedpeek2 = "Shaha";
		String actualpeek = sas2.peek();
		String actualpeek2 = sas2.peek();
		assertEquals(expectedpeek, actualpeek);
		assertEquals(expectedpeek2, actualpeek2);
	}

}

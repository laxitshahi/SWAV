package project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest {

	@Test
	void test() {
		String name = "Robert";
		Integer number = 85;
		TestClass test = new TestClass(name, number);
		
		String expected = "Robert";
		String actual = test.name;

		assertEquals(expected, actual);
		
	}

	
}

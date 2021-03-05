package Myapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testgetname() {
		assertEquals("Welcome to college",HelloWorld.getname());
	}

}

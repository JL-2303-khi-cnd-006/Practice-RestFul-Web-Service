package com.jave.pracdemo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Pracdemo1ApplicationTests {

	public Greeting greeting = new Greeting(1, "Hello World");

	@Test
	void contextLoads() {
	}

	@Test
	void greetingtest(){
		assertEquals("Hello World", greeting.text());
	}

	@Test
	void testTheGreeting(){
			Greeting greeting = new Greeting(1, "Hello");
			assertEquals(1, greeting.id());
			assertEquals("Hello", greeting.content());
	}
}


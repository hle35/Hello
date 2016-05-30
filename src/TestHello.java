import static org.junit.Assert.*;

import org.junit.Test;

public class TestHello {

	@Test
	public void testHello() {
		String expectedGreeting = "Hello!" ;
		Hello myHello = new Hello(expectedGreeting);
		assertEquals("Hello getGreeting() failure.", expectedGreeting, myHello.getGreeting());
	}
	
	
}

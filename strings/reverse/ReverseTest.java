package strings.reverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void emptyTest() {
		String s = "";
		assertEquals("", Reverse.reverse(s));
	}
	
	@Test
	public void smallTest() {
		String s = "abcd";
		assertEquals("dcba", Reverse.reverse(s));
	}
	
	@Test
	public void smallMultTest() {
		String s = "aabbcd";
		assertEquals("dcbbaa", Reverse.reverse(s));
	}
	
	@Test
	public void medTest() {
		String s = "abcdh78hsoofhsfhgrbrgp";
		assertEquals("pgrbrghfshfoosh87hdcba", Reverse.reverse(s));
	}
	
	@Test
	public void easierTest() {
		String s = "aaaaaaaad";
		assertEquals("daaaaaaaa", Reverse.reverse(s));
	}

}

package strings.replace;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceTest {

	@Test
	public void smallTest() {
		String s = "hi igor";
		assertEquals("hi%20igor", Replace.replace(s));
	}
	
	@Test
	public void noSpacesTest() {
		String s = "hello";
		assertEquals("hello", Replace.replace(s));
	}
	
	@Test
	public void longerExample() {
		String s = "Hello sir, I hope you are well. I really like food.";
		assertEquals("Hello%20sir,%20I%20hope%20you%20are%20well.%20I%20really%20like%20food.", Replace.replace(s));
	}
	
	@Test
	public void empty() {
		String s = "";
		assertEquals("", Replace.replace(s));
	}
	

}

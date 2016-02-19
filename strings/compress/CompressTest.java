package strings.compress;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompressTest {

	@Test
	public void monoLetter() {
		String s = "aaaa";
		assertEquals("a4", Compress.compress(s));
	}
	
	@Test
	public void multiLetter() {
		String s = "aaaabbccc";
		assertEquals("a4b2c3", Compress.compress(s));
	}

	@Test
	public void multiLetterNotCompressed() {
		String s = "aabbcdeeffab";
		assertEquals("aabbcdeeffab", Compress.compress(s));
	}
	
	@Test
	public void empty() {
		String s = "";
		assertEquals("", Compress.compress(s));
	}
}

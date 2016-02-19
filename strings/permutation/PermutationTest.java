package strings.permutation;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationTest {

	@Test
	public void applePapelTest() {
		String s1 = "apple";
		String s2 = "papel";
		assertTrue(Permutation.isPerm(s1, s2));
	}
	
	@Test
	public void simpleNotTest() {
		String s1 = "apples";
		String s2 = "papel";
		assertFalse(Permutation.isPerm(s1, s2));
	}
	
	@Test
	public void longStringstest() {
		String s1 = "abcdegfhilmnopjk";
		String s2 = "abcdefghijklmnop";
		assertTrue(Permutation.isPerm(s1, s2));
	}
	
	@Test
	public void emptyTest() {
		String s1 = "";
		String s2 = "";
		assertTrue(Permutation.isPerm(s1, s2));
	}

}

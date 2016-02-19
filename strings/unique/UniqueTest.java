package strings.unique;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueTest {

	@Test
	public void simpleTest() {
		String s = "a";
		assertTrue(Unique.uniqueStr(s));
	}

	@Test
	public void uniqueLettersComplex() {
		String s = "ahye84^5njio][(1xt";
		assertTrue(Unique.uniqueStr(s));
	}
	
	@Test
	public void onePairTest() {
		String s = "abcdeffghijk125680!@$%^&";
		assertFalse(Unique.uniqueStr(s));
	}
	
	@Test
	public void multPairsTest() {
		String s = "abbcdeffgh";
		assertFalse(Unique.uniqueStr(s));
	}
	
	@Test
	public void emptyTest() {
		String s = "";
		assertTrue(Unique.uniqueStr(s));
	}
}

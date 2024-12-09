package creditCard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	public void testSolution() {
		assertEquals("############5616", Maskify.maskify("4556364607935616"));
		assertEquals("#######5616", Maskify.maskify("64607935616"));
		assertEquals("1", Maskify.maskify("1"));
		assertEquals("", Maskify.maskify(""));

		// "What was the name of your first pet?"
		assertEquals("##ippy", Maskify.maskify("Skippy"));
		assertEquals("####################################man!",
				Maskify.maskify("Nananananananananananananananana Batman!"));
	}

}

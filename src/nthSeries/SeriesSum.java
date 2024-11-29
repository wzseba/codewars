package nthSeries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SeriesSum {

	@Test
	void test() {
		assertEquals("1,57", NthSeries.seriesSum(5));
	}

	@Test
	void test2() {
		assertEquals("1,25", NthSeries.seriesSum(2));
	}

	@Test
	void test3() {
		assertEquals("1,77", NthSeries.seriesSum(9));
	}

}

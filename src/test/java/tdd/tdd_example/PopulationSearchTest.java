package tdd.tdd_example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PopulationSearchTest {
	@Test
	public void findPopulaion() {
		PopulationSearch ps = new PopulationSearch();
		String city = "Bangalore";
		Assert.assertEquals(200000, ps.getPopulation(city));
	}

	@Test(expected = NullPointerException.class)
	public void findPopulaionWithEmptyCity() {
		PopulationSearch ps = new PopulationSearch();
		String city = "";
		try {
			Assert.assertEquals(200000, ps.getPopulation(city));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = NullPointerException.class)
	public void findPopulaionWithInvalidInput() {
		PopulationSearch ps = new PopulationSearch();
		Assert.assertEquals(200000, ps.getPopulation("xcv"));
	}
}

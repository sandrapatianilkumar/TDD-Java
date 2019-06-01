package tdd.tdd_example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class PopulationSearch {
	public int getPopulation(String city) {
		Map<String, Integer> populationMap = null;
		int count = 0;
		if (city.isEmpty()) {
			throw new NullPointerException("Input should not be empty");
		}
		populationMap = getPopulationStatistic();
		if (!populationMap.containsKey(city)) {
			throw new NullPointerException("Invalid input");
		}
		count = populationMap.get(city);
		return count;
	}

	private Map<String, Integer> getPopulationStatistic() {
		Map<String, Integer> populationMap = new HashMap<String, Integer>();
		populationMap.put("Hyderabad", 500000);
		populationMap.put("Bangalore", 200000);
		populationMap.put("Pune", 300000);
		populationMap.put("Mumbai", 800000);
		return populationMap;
	}
}

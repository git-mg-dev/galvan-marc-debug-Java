package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	/**
	 * This program is used to read a list of symptom from a file and to write them
	 * in a result file with their number of occurrence
	 * 
	 * @param args parameters from command line
	 */
	public static void main(String[] args) {
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);

		List<String> symptoms = analyticsCounter.getSymptoms();
		Map<String, Integer> counter = analyticsCounter.countSymptoms(symptoms);
		Map<String, Integer> sortedResult = analyticsCounter.sortSymptoms(counter);

		analyticsCounter.writeSymptoms(sortedResult);
	}

}

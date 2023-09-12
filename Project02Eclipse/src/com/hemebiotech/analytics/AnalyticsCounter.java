package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {
	public static void main(String args[]) {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		Map<String, Integer> counter = reader.GetSymptoms();

		// next generate output
//		FileWriter writer = new FileWriter("result.out");
//		writer.write("headache: " + headacheCount + "\n");
//		writer.write("rash: " + rashCount + "\n");
//		writer.write("dialated pupils: " + pupilCount + "\n");
//		writer.close();

	}
}

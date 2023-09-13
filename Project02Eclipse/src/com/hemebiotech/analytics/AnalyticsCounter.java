package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * The AnalyticsCounter class is used to read an input data file containing
 * symptoms and to generate an output file with the symptoms and their
 * occurrence
 */
public class AnalyticsCounter {
	private ISymptomReader myReader;
	private ISymptomWriter myWriter;

	/**
	 * Class constructor
	 * 
	 * @param reader the file reader to read the data file
	 * @param writer the file writer to write t
	 */
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.myReader = reader;
		this.myWriter = writer;
	}

	/**
	 * Gets the symptoms from the data file and store them in a list
	 * @return List of symptoms as strings with duplications
	 */
	public List<String> getSymptoms() {
		return myReader.getSymptoms();
	}

	/**
	 * Counts the number of occurrence of each symptom
	 * @param symptoms the list of symptoms
	 * @return the symptoms and their number of occurrence in a map (not sorted)
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> result = new HashMap<String, Integer>();

		for (String s : symptoms) {
			if (result.containsKey(s)) {
				int counter = result.get(s);
				result.put(s, counter + 1);
			} else {
				result.put(s, 1);
			}
		}
		return result;
	}

	/**
	 * Sorts a map of symptoms into alphabetical order
	 * @param symptoms the map of symptoms and their number of occurrence
	 * @return the sorted map
	 */
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		Map<String, Integer> sortedSymptoms = new TreeMap<>(symptoms);
		return sortedSymptoms;
	}

	/**
	 * Writes a map of symptom and their number of occurrence in a file
	 * @param symptoms
	 */
	public void writeSymptoms(Map<String, Integer> symptoms) {
		myWriter.writeSymptoms(symptoms);
	}
}

package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will read symptom data from a source The important part is the
 * list of symptoms from the source and the number of occurrences
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty Map
	 * 
	 * @return a map with the symptoms as key and number of occurrences as value
	 */
	Map<String, Integer> GetSymptoms();
}

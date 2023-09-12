package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	private ISymptomReader myReader;
	private ISymptomWriter myWriter;

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.myReader = reader;
		this.myWriter = writer;
	}

	public List<String> GetSymptoms() {
		return myReader.GetSymptoms();
	}

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

	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		Map<String, Integer> sortedSymptoms = new TreeMap<>(symptoms);
		return sortedSymptoms;
	}

	public void writeSymptoms(Map<String, Integer> symptoms) {
		myWriter.writeSymptoms(symptoms);
	}
}

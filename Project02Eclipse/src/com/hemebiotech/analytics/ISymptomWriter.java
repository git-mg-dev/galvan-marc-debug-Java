package com.hemebiotech.analytics;

import java.util.Map;

/**
 * This is an interface to write symptoms and their occurrence in a specific output
 * 
 */
public interface ISymptomWriter {
	
	public void writeSymptoms(Map<String,Integer>symptoms);
}

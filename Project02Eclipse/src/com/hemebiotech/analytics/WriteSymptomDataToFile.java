package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The WriteSymptomDataToFile class is used to write the list of symptoms and
 * their occurrence in a text file
 */
public class WriteSymptomDataToFile implements ISymptomWriter {
	private String outputFilepath;

	/**
	 * Class constructor
	 * 
	 * @param outpath a full or partial path to file to write result in
	 */
	public WriteSymptomDataToFile(String outpath) {
		this.outputFilepath = outpath;
	}

	/**
	 * Creates a file with a list of symptoms and their respective numbers of
	 * occurrences
	 * 
	 * @param symptoms contains all the symptoms and their respective numbers of
	 *                 occurrences to be written in the file
	 */
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		if (outputFilepath != null) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilepath));

				for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
					writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
				}

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

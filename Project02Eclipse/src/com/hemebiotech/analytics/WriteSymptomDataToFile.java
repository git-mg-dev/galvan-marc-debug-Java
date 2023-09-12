/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * @param outpath a full or partial path to file to write result in
 */
public class WriteSymptomDataToFile implements ISymptomWriter {
	private String outputFilepath;

	public WriteSymptomDataToFile(String outpath) {
		this.outputFilepath = outpath;
	}

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

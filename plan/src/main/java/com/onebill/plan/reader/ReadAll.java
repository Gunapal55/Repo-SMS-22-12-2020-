package com.onebill.plan.reader;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadAll {


public static void readAll(String file) 
{ 
	try { 
		
		
		FileReader filereader = new FileReader(file); 

		
		CSVParser parser = new CSVParserBuilder().withSeparator(',').build(); 

		
		CSVReader csvReader = new CSVReaderBuilder(filereader) 
								.withCSVParser(parser) 
								.build(); 

		List<String[]> allData = csvReader.readAll(); 

	
		for (String[] row : allData) { 
			for (String cell : row) { 
				System.out.print(cell+" "); 
			} 
			System.out.println(); 
		} 
	} 
	catch (Exception e) { 
		e.printStackTrace(); 
	} 
} 
	
}

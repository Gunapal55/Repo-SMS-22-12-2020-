package com.onebill.plan.reader;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class ReadCsv {

	public void readCsv(String path) {

		try {

			FileReader filereader = new FileReader(path);

			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;

			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			csvReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package com.onebill.plan.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadCsvArray {

	protected void readCsv(String path) {
		SubIdentifyer iden = new SubIdentifyer();
		String line = "";
		String splitBy = ",";
		try {

			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(splitBy);
				String sub = data[3];
				String act = data[5];
				String sus = data[6];
				iden.subIdentifiyer(sub);
				sub = "Active";
				if (sub == "Active") {

					System.out.println("Active plan is: " + act);
					String active = "1";
					String notActive = "0";
					if (act.equals(active) && sus.equals(notActive)) {
						System.out.println("No changes in plan " + data[4] + " plan continues for Subscriber Identifier-"+data[3]);
					}
					if (act.equals(notActive) && sus.equals(active)) {
						System.out.println("Switch current plan " + data[4] + " to Suspended plan for Subscriber Identifier-"+data[3]);
						System.out.println("=====================Calling switch plan API==========================");
						
					}

				}

			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

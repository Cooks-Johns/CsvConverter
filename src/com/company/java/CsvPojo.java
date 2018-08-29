package com.company.java;


import com.company.domain.Csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class CsvPojo {



        public void csvPojo() {

            String csvFileToRead = "csv/SampleCsv.csv";
            BufferedReader reading = null;
            String line = "";
            String splietBy = ",";
            List<Csv> csvList = new ArrayList<>();



            try {
                reading = new BufferedReader(new FileReader(csvFileToRead));
                while ((line = reading.readLine()) != null) {

                    String[] csv = line.split(splietBy);

                    Csv csvObject = new Csv();


                    csvObject.setTeamName(csv[0]);
                    csvObject.setAppId(csv[1]);
                    csvObject.setAppName(csv[2]);
                    csvObject.setVulnerabilityId(csv[3]);
                    csvObject.setVulnerabilityReference(csv[4]);
                    csvObject.setSeverity(csv[5]);
                    csvObject.setStatus(csv[6]);
                    csvObject.setOpenDate(csv[7]);
                    csvObject.setScanner(csv[8]);
                    csvObject.setCweId(csv[9]);
                    csvObject.setOwaspTopTen(csv[10]);
                    csvObject.setPath(csv[11]);
                    csvObject.setParameter(csv[12]);
                    csvObject.setPayload(csv[13]);
                    csvObject.setAttackSurfacePath(csv[14]);
                    csvObject.setAttackString(csv[15]);
                    csvObject.setAttackRequest(csv[16]);
                    csvObject.setAttackResponse(csv[17]);
                    csvObject.setScannerDetails(csv[18]);
                    csvObject.setScannerRecommendation(csv[19]);
                    csvObject.setRemediationTargetDate(csv[20]);
                    csvObject.setApplicationTags(csv[21]);
                    csvObject.setVulnerabilityTags(csv[22]);

                    csvList.add(csvObject);


                }
//                printCsvList(csvList);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reading != null) {
                    try {
                        reading.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
//
//        public void printCsvList(List<csv> csvListToPrint) {
//            for( int i = 0; i < csvListToPrint.size(); i ++) {
//                System.out.println(
//                        "DG [Team Name = " + csvListToPrint.get(i).getTeamName()
//                      + " , App Id = " + csvListToPrint.get(i).getAppId());
//
//
//            }
//        }

}

package com.company.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCsv {

    public void readCsv() {
        String csvFileToRead = "csv/SampleCsv.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null) {

                String[] csv = line.split(splitBy);

                System.out.println("DgCsvData [ Team Name= " + csv[0]
                        + ",app Unique ID= " + csv[1]
                        + "  Application Name= " + csv[2]
                        + " ,Vulnerability ID= " + csv[3]
                        + " ,Vulnerability Name= " + csv[4]
                        + " ,Vulnerability Reference= " + csv[5]
                        + " ,Severity= " + csv[6]
                        + " ,Status= " + csv[7]
                        + " ,Open Date= " + csv[8]
                        + " ,Scanner= " + csv[9]
                        + " ,CWE ID= " + csv[10]
                        + " ,CWE Name= " + csv[11]
                        + " ,OWASP Top 10= " + csv[12]
                        + " , Path= " + csv[13]
                        + " ,Parameter= " + csv[14]
                        + " ,Payload= " + csv[15]
                        + " ,Attack Surface Path= " + csv[16]
                        + " ,Attack String= " + csv[17]
                        + " ,Attack Request= " + csv[18]
                        + " ,Attack Response= " + csv[19]
                        + " ,Scanner Details= " + csv[20]
                        + " ,Scanner Recommendation= " + csv[21]
                        + " ,Remediation Target Date= " + csv[22]
                        + " ,Application Tags= " + csv[23]
                        + " ,Vulnerability Tags=" + csv[24]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("I am finished reading your CSV. ");
    }
}



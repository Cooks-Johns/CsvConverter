package com.company.java;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        System.out.println("Welcome to the converter!");
        System.out.println("Now lets begain!");

        System.out.println("Reading data from CSV: ");
        ReadingCsv readCsv = new ReadingCsv();
        readCsv.readCsv();


        System.out.println("Reading data from csv and converting it to java object:");
        CsvPojo csvPojo = new CsvPojo();
        csvPojo.csvPojo();
    }
}

package com.company.java;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class Main {


    public static void main(String[] args) throws Exception {

	something();



    }

    public static void something() {

        File input = new File("/Users/johnathoncook/IdeaProjects/CsvConverter/src/csv/Bodgeit.csv");
        File output = new File("/Users/johnathoncook/IdeaProjects/CsvConverter/src/csv/output/build.json");

        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
        CsvMapper csvMapper = new CsvMapper();

        // Read data from CSV file
        List<Object> readAll = null;
        try {
            readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();

        // Write JSON formated data to output.json file
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(output, readAll);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write JSON formated data to stdout
        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

}

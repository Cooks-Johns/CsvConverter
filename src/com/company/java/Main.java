package com.company.java;
import java.io.File;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        System.out.println("Testing, Hello World");

        File input = new File("/Users/johnathoncook/IdeaProjects/CsvConverter/src/csv/Bodgeit.csv");
        File output = new File("/Users/johnathoncook/IdeaProjects/CsvConverter/src/csv/output/build.json");

        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
        CsvMapper csvMapper = new CsvMapper();

        // Read data from CSV file
        List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();

        ObjectMapper mapper = new ObjectMapper();

        // Write JSON formated data to output.json file
        mapper.writerWithDefaultPrettyPrinter().writeValue(output, readAll);

        // Write JSON formated data to stdout
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll));
    }
}

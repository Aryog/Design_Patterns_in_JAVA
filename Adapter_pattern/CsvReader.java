package Adapter_pattern;

class CsvReader {
    public String readDataFromCsv(String filePath) {
        // Logic to read data from CSV file and return it
        System.out.println("Reading data from CSV file: " + filePath);

        // For the sake of example, returning some CSV-formatted data
        return "CSV Data: value1, value2, value3";
    }
}

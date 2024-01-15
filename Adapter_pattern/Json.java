package Adapter_pattern;

/**
 * Json
 */
interface JsonReader {
    String readDataFromJson(String filePath);
}

class JsonAdapter implements JsonReader {
    private CsvReader csvReader;

    public JsonAdapter(CsvReader csvReader) {
        this.csvReader = csvReader;
    }

    @Override
    public String readDataFromJson(String filePath) {
        // Use the CsvReader internally to read data from CSV
        String csvData = csvReader.readDataFromCsv(filePath);

        // Convert CSV data to Json format (for the sake of exampke, a simple
        // conversion)
        String jsonData = convertCsvToJson(csvData);
        System.out.println("Adapted CSV data to Json: " + jsonData);
        return jsonData;
    }

    private String convertCsvToJson(String csvData) {
        // For the sake of example, a simple conversion from CSV to JSON
        // In a real-world scenario, a proper conversion logic is recommended
        return "JSON Data: {" + csvData + "}";
    }
}
package Adapter_pattern;

public class Client {
    public static void main(String[] args) {
        // Create an instance of the legacy CsvReader
        CsvReader csvReader = new CsvReader();

        // Use the adapter to make CsvReader work as a JsonReader
        JsonReader jsonReader = new JsonAdapter(csvReader);

        // Now, the client code can use the JsonReader interface
        String jsonData = jsonReader.readDataFromJson("example.csv");
        System.out.println(jsonData);
    }
}

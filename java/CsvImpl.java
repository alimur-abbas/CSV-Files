import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvImpl {
private static final String CSV_FILE_PATH = "C:\\Users\\Alimur\\Desktop\\SpringBoot\\CsvFileImpl\\src\\main\\resources\\results.csv ";
private static final String CSV_FILE_CUSTOM_SEPERATOR = "C:\\Users\\Alimur\\Desktop\\SpringBoot\\CsvFileImpl\\src\\main\\resources\\results_semicolon_Separator.csv ";

    public static void main(String[] args) throws IOException {
        System.out.println("Reading data line by line from file with header\n");
        readDataLbyL(CSV_FILE_PATH);
        System.out.println("==========================================");
        System.out.println("Read all data from file at once and hiding the header");
        readAlldataAtOnce(CSV_FILE_PATH);
        System.out.println("==========================================");
        System.out.println("Read data from custom seperator file");
        readDataFromCustomSeperator(CSV_FILE_CUSTOM_SEPERATOR);

    }

    private static void readDataFromCustomSeperator(String csvFileCustomSeperator) throws IOException {
        FileReader fileReader = new FileReader(csvFileCustomSeperator);
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();//CSVParserBuilder is used for custom seperator.
        CSVReader csvReader = new CSVReaderBuilder(fileReader).withCSVParser(csvParser).build();// first we need to build a parser then reader using reader builder and add that parser.
        List<String[]> record = csvReader.readAll();
        for ( String [] row:record){
            for (String data : row){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }

    private static void readAlldataAtOnce(String csvFilePath) throws IOException {
        FileReader fileReader = new FileReader(csvFilePath);
        CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();//.withSkipLine() is under CSVReaderBuilder class.
        List<String[]> record = csvReader.readAll();
        for ( String [] row:record){
            for (String data : row){
                System.out.print(data);
            }
            System.out.println();
        }
    }

    private static void readDataLbyL(String csvFilePath) throws IOException {
        FileReader fileReader = new FileReader(csvFilePath);
        CSVReader csvReader = new CSVReader(fileReader);
        String [] record ;
        while ((record = csvReader.readNext())!= null){
            for (String output:record) {
                System.out.print(output);
            }
            System.out.println();
        }
    }
}

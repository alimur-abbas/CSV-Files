import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectMappingFromCsvFile {
    private static final String CSV_FILE_PATH = "C:\\Users\\Alimur\\Desktop\\SpringBoot\\CsvFileImpl\\src\\main\\resources\\results.csv ";
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(CSV_FILE_PATH);
        CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
        List<Student> students =  csvReader.readAll().stream().map(data->{
            Student student = new Student();
            student.setName(data[0]);
            student.setRollNo(data[1]);
            student.setDepartment(data[2]);
            student.setResult(data[3]);
            student.setCgpa(data[4]);
            return student;}).collect(Collectors.toList());
        students.forEach(System.out::println);
        }
    }




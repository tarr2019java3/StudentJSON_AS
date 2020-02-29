package pl.sda.student;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JSONUtils {

    public void writeList(String filename, List<Student> list) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readList(String filename) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File(filename);

            Student value[] = mapper.readValue(file, Student[].class);
            for (int x = 0; x < value.length; x++) {
                System.out.println("Student: " + x + ":");
                System.out.println("Imię: " + value[x].getName());
                System.out.println("Nazwisko: " + value[x].getLastname());
                System.out.println("Indeks: " + value[x].getIndex());
                System.out.println("----------------------------------");
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


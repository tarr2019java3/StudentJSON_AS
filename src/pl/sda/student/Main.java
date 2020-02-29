package pl.sda.student;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 32); //serializacja - przekształcenie obiektu
        ObjectMapper mapper = new ObjectMapper();                                          // serializujemy do formatu JSON
        try {
            mapper.writeValue(new File("student.json"), student);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package pl.sda.student;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 10); //serializacja - przekształcenie obiektu
        Student student1 = new Student("Marian", "Banaś", 11);
        Student student2 = new Student("Zenek", "Martyniuk", 12);
        Student student3 = new Student("Jan", "Szlaga", 13);
        Student student4 = new Student("Monika", "Brodka", 14);
        Student student5 = new Student("Wiesław", "Zięba", 15);

        ObjectMapper mapper = new ObjectMapper();   // serializujemy do formatu JSON

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        try {
            mapper.writeValue(new File("student.json"), student);
            mapper.writeValue(new File("student1.json"), student1);
            mapper.writeValue(new File("student2.json"), student2);
            mapper.writeValue(new File("student3.json"), student3);
            mapper.writeValue(new File("student4.json"), student4);
            mapper.writeValue(new File("student5.json"), student5);
            mapper.writeValue(new File("studentList.json"), studentList);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

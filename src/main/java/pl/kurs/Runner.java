package pl.kurs;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws OperationNotPossible {
        Teacher teacher = new Teacher("Teacher");
        Teacher teacher2 = new Teacher("Teacher2");
        Teacher teacher3 = new Teacher("Teacher3");
        Student student = new Student("Student");
        Principal principal = new Principal("Principal");

        try {
            ConvertToJsonService.convertObjectToJson(student);
        } catch (OperationNotPossible e) {
            System.out.println(e.getMessage());
        }


    }


}
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

        Runner.convertObjectToJson(teacher);
        Runner.convertObjectToJson(teacher2);
        Runner.convertObjectToJson(teacher3);



    }

    public static <T> void convertObjectToJson(T object) throws OperationNotPossible {
        try {
            if(!object.getClass().equals(Teacher.class)){
                throw new OperationNotPossible("Wrong person for save!");
            }

            ObjectMapper mapper = new ObjectMapper();
            File jsonFile = new File("src/main/resources/teachers.json");

            mapper.writeValue(jsonFile, object);

            System.out.println("Obiekt został zapisany!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
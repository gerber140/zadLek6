package pl.kurs;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConvertToJsonService {
    public static <T> void convertObjectToJson(T object) throws OperationNotPossible {
        if (object instanceof Teacher) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                File jsonFile = new File("src/main/resources/teachers.json");

                mapper.writeValue(jsonFile, object);

                System.out.println("Obiekt został zapisany!");
            } catch (IOException e) {
                throw new OperationNotPossible("Error whiile converting to json!");
            }
        } else {
            throw new OperationNotPossible("Wrong person for save!");
        }
    }
}

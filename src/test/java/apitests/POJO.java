package apitests;

import apiModules.Instructor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class POJO {


    @Test
    public void testPojo() throws JsonProcessingException {

        Instructor in = new Instructor();
        in.setBatch(10);
        in.setFirstName("Mariya");
        in.setLastMarych("Marych");
        in.setId(234);

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(in);
        System.out.println(json);
        Instructor instructor2 = mapper.readValue(json, Instructor.class);
        System.out.println(instructor2.getFirstName());
    }








}

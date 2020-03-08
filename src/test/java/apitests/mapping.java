package apitests;

import apiModules.Instructor;
import apiModules.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class mapping {

    @Test
    public void pojoMapping() throws Exception{
       String json = " {" +
               "            \"teacherId\": 315,\n" +
               "            \"firstName\": \"Mary\",\n" +
               "            \"lastName\": \"Smith\",\n" +
               "            \"emailAddress\": \"marysmith@gmail.com\",\n" +
               "            \"joinDate\": \"03/17/2020\",\n" +
               "            \"password\": \"ebru\",\n" +
               "            \"phone\": \"7734567896\",\n" +
               "            \"subject\": \"math\",\n" +
               "            \"gender\": \"Female\",\n" +
               "            \"department\": \"Computer\",\n" +
               "            \"birthDate\": \"03/19/1980\",\n" +
               "            \"salary\": 100000,\n" +
               "            \"batch\": 3,\n" +
               "            \"section\": \"science\",\n" +
               "            premanentAddress: 67 Hay rd. Wisconsin 79605" +
               "        }";

        ObjectMapper mapper = new ObjectMapper();

        Instructor instructor1 = mapper.readValue(json, Instructor.class);


        System.out.println( instructor1.getFirstName());


    }

    @Test
    public void singleStudent() throws JsonProcessingException {
       Response response = RestAssured.get("http://api.cybertektraining.com/student/3526");

        ObjectMapper mapper1 = new ObjectMapper();

        //3.store in string the json file using mapping
        //take json file and transfer to java class
        Student student = mapper1.readValue(response.asString(),Student.class);

        System.out.println(student.getFirstName());


    }




}

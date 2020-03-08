package apitests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CMstudents {

    @Test
    public void studentTest() {

        Response response = RestAssured.get("http://cybertekchicago.com/teacher/all");
        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(), 200);
//RestAssured.given().get("http://cybertekchicago.com/teacher/all").then().statusCode(200);
        System.out.println(response.asString());


    }


    @Test
    public void singleStudentTest() {

        Response response = RestAssured.get("http://api.cybertektraining.com/student/3763");
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        System.out.println(jp.getList("students.batch"));
        System.out.println(jp.getList("students.contact.phone"));
        System.out.println(jp.getList("students.subject"));
        System.out.println(jp.getList("students.company.title"));
        System.out.println(jp.getList("students.company.address.street"));
        System.out.println(jp.getList("students.company.companyId"));
        System.out.println(jp.getList("students.contact.contactId"));

    }


    @Test
    public void allStudentTest() {

        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);

        JsonPath jp = response.jsonPath();

        List<String > pnoneNUmbers = jp.getList("students.contact.phone");

        System.out.println(pnoneNUmbers.size());
        System.out.println(jp.getList("students.contact.phone"));

        for (String phone:pnoneNUmbers) {
            System.out.println(phone.isEmpty());
        }


    }







}

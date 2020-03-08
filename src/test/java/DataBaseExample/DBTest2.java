package DataBaseExample;

import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBTest2 {

    public static void main(String[] args) throws SQLException {
        DBUtility.createConnection();

        List<Map<Object, Object>> mydata = DBUtility.executeQuery("Select * from employees ");

        DBUtility.close();


        for (Map<Object, Object> map : mydata) {


            if (map.get("EMPLOYEE_ID").toString().equals("" + 176)) {
                if (Integer.valueOf(map.get("SALARY").toString())==8600)
                    System.out.println("id " + map.get("EMPLOYEE_ID") + " salary: " + map.get("SALARY") + " IS VERIFIYED");

            }

        }


        DBUtility.createConnection();
        List<Map<Object, Object>> salaries = DBUtility.executeQuery("Select salary,last_name from employees");

        DBUtility.close();

        for (Map<Object, Object> element : salaries) {
            if (element.get("SALARY").toString().equals("24000")){
                if(element.get("LAST_NAME").toString().equals("King"))
                    System.out.println("salary "+element.get("SALARY")+" Last name: "+element.get("LAST_NAME"));
            }
        }


        DBUtility.createConnection();
        List<Map<Object, Object>> phoneNumber = DBUtility.executeQuery("Select phone_number,last_name from employees");

        DBUtility.close();


        for (Map<Object, Object> element1 : phoneNumber) {
            if (element1.get("PHONE_NUMBER").toString().equals("515.123.4567")){
                if(element1.get("LAST_NAME").toString().equals("King"))
                    System.out.println("phone number "+element1.get("PHONE_NUMBER")+" Last name: "+element1.get("LAST_NAME"));
            }
        }




        DBUtility.createConnection();
        List<Map<Object, Object>> email = DBUtility.executeQuery("Select email,last_name from employees");

        DBUtility.close();






    }


}

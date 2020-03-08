package DataBaseExample;

import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Test1SQL {

    public static void main(String[] args) throws SQLException {


        DBUtility.createConnection();

        List<Map<Object, Object>> mydata = DBUtility.executeQuery("SELECT * FROM EMPLOYEES ");

        DBUtility.close();

        for (Map<Object, Object> map : mydata) {

            if (map.get("EMPLOYEE_ID").toString().equals("" + 175)) {
                if (map.get("SALARY").toString().equals("" + 8800)) {
                    System.out.println("ID" + map.get("EMPLOYEE_ID") + "Salary: " + map.get("SALARY") + " is verified!");

                }
            }
        }
        {

        }


    }


}
// How do you guys override equals method --> you need to override hashcode method.
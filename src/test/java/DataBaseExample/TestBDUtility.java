package DataBaseExample;

import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestBDUtility {

    public static void main(String[] args) throws SQLException {


        DBUtility.createConnection();
        List<Map<Object, Object>> mydata = DBUtility.executeQuery("SELECT employee_id, first_name, last_name, salary FROM EMPLOYEES where rownum <=5");
        DBUtility.close();

        for (Map<Object, Object> map : mydata) {
            System.out.println(map);
        }
        {

        }







    }


}

package DataBaseExample;

import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Test3 {


    public static void main(String[] args) throws SQLException {


        DBUtility.createConnection();

        List <Map<Object,Object>> ma1p =  DBUtility.executeQuery("SELECT * FROM EMPLOYEES ");

        DBUtility.close();

        for (Map<Object,Object> m :ma1p) {
           if( m.get("JOB_ID").toString().equals("AD_PRES")){
               if(m.get("SALARY").toString().equals("24000")){
                   System.out.println("JobID "+m.get("JOB_ID")+ ": Salary: "+ m.get("SALARY")+" , IS VERIFIED");
               }


           }
        }




    }
}

package DataBaseExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aibek {


    public static void main(String[] args) {

        Map<String,String>   map1 = new HashMap<>();

        map1.put("First_name","John");
        map1.put("Last_name","Wick");
        map1.put("Job_id","Fighter");
map1.get("First_name");//==>john

        Map<String,String>   map2 = new HashMap<>();

        map2.put("First_name","Alice");
        map2.put("Last_name","Wick");
        map2.put("Job_id","Fighter");


        Map<String,String>   map3 = new HashMap<>();

        map3.put("First_name","Nancy");
        map3.put("Last_name","Johnson");
        map3.put("Job_id","teacher");



        List <Map<String,String>> DATA = new ArrayList<>();
        DATA.add(map1);
        DATA.add(map2);
        DATA.add(map3);


        System.out.println(DATA.get(1).get("Job_id"));









    }
}

package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogsTest {

    public static void main(String[] args) {


    Logger logger = LogManager.getLogger(LogsTest.class);

        System.out.println("test started");
        System.out.println("going to the dzone.com");
        logger.info("on dzon.com");
        System.out.println("click on login button");
        logger.warn("login int to app");
        Log.info("starting the test");
        Log.warn("login in to amazon");
}


}

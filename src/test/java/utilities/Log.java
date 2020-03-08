package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    private static Logger logger = LogManager.getLogger(Log.class);
    public static void start(String testName){
        logger.info("scenario start point: "+testName);
    }
    public static void info(String massage){
        logger.info(massage);
    }
    public static void warn(String massage){
        logger.warn(massage);
    }
    public static void error(String massage){
        logger.error(massage);
    }
}
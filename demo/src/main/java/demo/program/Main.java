package demo.program;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Application started");

        try {
        	   logger.warn("Warning here");
            int result = divide(10, 0);
            logger.info("Result: " + result);
        } catch (Exception e) {
            logger.error("Error occurred: {}", e.getMessage());
        }

        logger.info("Application finished");
    }

    private static int divide(int a, int b) {
        logger.debug("Dividing {} by {}", a, b);
        return a / b;
    }
}


package MyPakage2;

import java.util.logging.*;

public class logger {
    private static final Logger logger = Logger.getLogger(logger.class.getName());

    public static void main(String[] args) throws Exception {

        FileHandler fileHandler = new FileHandler("logFile.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
       // logger.setLevel(Level.SEVERE);

        // Log some messages
       logger.info("Info message logged to file and console");
       logger.warning("Warning message logged to file and console");
        logger.severe("Severe message logged to file and console");


    }

}

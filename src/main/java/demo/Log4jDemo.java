package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//https://springframework.guru/log4j-2-configuration-using-properties-file/
//https://logging.apache.org/log4j/2.x/maven-artifacts.html
//https://howtodoinjava.com/log4j2/log4j2-xml-configuration-example/
//if have log4j2.properties and log4j2.xml, properties will be used
//https://stackoverflow.com/questions/14497787/log4j-properties-vs-log4j-xml
public class Log4jDemo {
    static Logger logger= LogManager.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        System.out.println("Hello");
        logger.trace("This is trace message");
        logger.info("This is info message");
        logger.error("This is error message");
        logger.warn("This is warning message");
        logger.fatal("This is fatal message");
        System.out.println("Complete");
    }
}

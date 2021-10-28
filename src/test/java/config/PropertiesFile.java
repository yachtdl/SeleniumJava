package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

//https://en.wikipedia.org/wiki/.properties

public class PropertiesFile {
    static Properties prop;
    static String path=System.getProperty("user.dir");

    public static void main(String[] args) {
        getProperties();
        setProperties();
        getProperties();
    }

    public static void getProperties(){
        try{
            prop=new Properties();
            InputStream input=new FileInputStream(path+"/src/test/java/config/config.properties");
            prop.load(input);
            String browser=prop.getProperty("browser");
            System.out.println(browser);
        }catch(Exception e){
            e.getStackTrace();
        }
    }

    public static void setProperties(){
        try{
            prop=new Properties();
            OutputStream output=new FileOutputStream(path+"/src/test/java/config/config.properties");
            prop.setProperty("browser","Chrome");
            prop.store(output,null);
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}

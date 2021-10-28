package utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//https://commons.apache.org/proper/commons-csv/user-guide.html
public class CSVUtils {
    static String path=System.getProperty("user.dir");
    static List<List<String>> list=new ArrayList<>();

    public static void main(String[] args) {
        getData("data");
    }

    public static void getData(String fileName){
        try{
            File file=new File(path+"/excel/"+fileName+".csv");
            InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(file));
            CSVParser csvParser=CSVFormat.DEFAULT.parse(inputStreamReader);
            for(CSVRecord r:csvParser)
                list.add(r.toList());
            System.out.println(list);
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}

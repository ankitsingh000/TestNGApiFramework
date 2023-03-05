package utls;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility {
    public static String readValue(String fileName,String key){
        try {
            FileReader fileReader = new FileReader(fileName);
            Properties properties=new Properties();
            properties.load(fileReader);
            return properties.getProperty(key);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

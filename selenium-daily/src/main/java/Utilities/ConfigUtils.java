package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
    private Properties prop;
    public ConfigUtils() throws IOException {
        prop=new Properties();
        FileInputStream file=new FileInputStream("src/main/resources/Config.properties");
        prop.load(file);
    }
    public String getProperty(String key){
        return prop.getProperty(key);

    }
}

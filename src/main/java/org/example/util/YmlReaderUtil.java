package org.example.util;


import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class YmlReaderUtil {
    public Map<String,Object> readYmlToMap(String filename){
        try(InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filename))
        {
            Yaml yaml = new Yaml();
            return yaml.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

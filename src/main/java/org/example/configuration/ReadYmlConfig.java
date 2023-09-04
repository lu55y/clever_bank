package org.example.configuration;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class ReadYmlConfig {
    private static final String APPLICATION_CONFIG = "application.yml";
    private static final ReadYmlConfig instance = new ReadYmlConfig();

    public static ReadYmlConfig getInstance() {
        return instance;
    }

    public DatabaseConfig readConfiguration() {
        try (InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(APPLICATION_CONFIG)) {
            Yaml yaml = new Yaml();
            return yaml.loadAs(inputStream, DatabaseConfig.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

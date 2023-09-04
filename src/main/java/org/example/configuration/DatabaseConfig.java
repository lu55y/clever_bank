package org.example.configuration;

public class DatabaseConfig {
    private String db_driver;
    private String db_url;
    private String db_username;
    private String db_password;
    private Integer db_pool_size;

    public String getDb_driver() {
        return db_driver;
    }

    public void setDb_driver(String db_driver) {
        this.db_driver = db_driver;
    }

    public String getDb_url() {
        return db_url;
    }

    public void setDb_url(String db_url) {
        this.db_url = db_url;
    }

    public String getDb_username() {
        return db_username;
    }

    public void setDb_username(String db_username) {
        this.db_username = db_username;
    }

    public String getDb_password() {
        return db_password;
    }

    public void setDb_password(String db_password) {
        this.db_password = db_password;
    }

    public Integer getDb_pool_size() {
        return db_pool_size;
    }

    public void setDb_pool_size(Integer db_pool_size) {
        this.db_pool_size = db_pool_size;
    }
}

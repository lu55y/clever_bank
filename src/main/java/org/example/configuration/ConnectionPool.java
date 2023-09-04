package org.example.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static final ConnectionPool instance = new ConnectionPool();
    private static final HikariDataSource dataSource;
    private static final HikariConfig hikariConfig = new HikariConfig();
    private static final DatabaseConfig dbConfig = ReadYmlConfig.getInstance().readConfiguration();

    static {
        hikariConfig.setJdbcUrl(dbConfig.getDb_url());
        hikariConfig.setUsername(dbConfig.getDb_username());
        hikariConfig.setPassword(dbConfig.getDb_password());
        hikariConfig.setMaximumPoolSize(dbConfig.getDb_pool_size());
        dataSource = new HikariDataSource(hikariConfig);
    }

    public static ConnectionPool getInstance() {
        return instance;
    }

    @SneakyThrows
    public Connection getConnection() throws SQLException {
        Class.forName(dbConfig.getDb_driver());
        Connection connection = dataSource.getConnection();
        connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        return connection;
    }
}

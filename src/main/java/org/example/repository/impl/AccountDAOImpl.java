package org.example.repository.impl;

import org.example.configuration.ConnectionPool;
import org.example.model.Account;
import org.example.repository.AccountDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();

    @Override
    public void create(Account account) {
        String sql = "INSERT INTO `clever-bank`.accounts " +
                "(id, account_number, bank_id, user_id, account_balance, creation_date) " +
                "VALUES (?,?,?,?,?,?)";
        try (Connection connection = connectionPool.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
        ){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Account find(int id) {

 /*       try (Connection connection = connectionPool.getConnection();
             PreparedStatement ps = connection.prepareStatement();
        ){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
        return null;
    }

    @Override
    public List<Account> findAll() {

      /*  try (Connection connection = connectionPool.getConnection();
             PreparedStatement ps = connection.prepareStatement();
        ){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
        return null;
    }

    @Override
    public void update(Account account) {

        /*try (Connection connection = connectionPool.getConnection();
             PreparedStatement ps = connection.prepareStatement();
        ){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
    }

    @Override
    public void delete(int id) {

        /*try (Connection connection = connectionPool.getConnection();
             PreparedStatement ps = connection.prepareStatement();
        ){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
    }
}

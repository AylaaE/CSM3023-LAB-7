package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.model.User;
import com.util.DBConnection;

public class UserDao {
    
    private Connection connection;
    
    public UserDao() throws ClassNotFoundException {
        connection = DBConnection.getConnection();
    }
    
    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO users(userid, firstname, lastname) VALUES (?, ?, ?)");
            preparedStatement.setString(1, user.getUserid());
            preparedStatement.setString(2, user.getFirstName());
            preparedStatement.setString(3, user.getLastName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteUser(String userId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("DELETE FROM users WHERE userid=?");
            preparedStatement.setString(1, userId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("UPDATE users SET firstname=?, lastname=? WHERE userid=?");
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getUserid());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setFirstName(rs.getString("firstname"));
                user.setLastName(rs.getString("lastname"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    
    public User getUserById(String userId) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM users WHERE userid=?");
            preparedStatement.setString(1, userId);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                user.setUserid(rs.getString("userid"));
                user.setFirstName(rs.getString("firstname"));
                user.setLastName(rs.getString("lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}

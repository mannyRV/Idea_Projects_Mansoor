package com.shop.repository;

import com.shop.db.MySQLConnectionFactory;
import com.shop.model.Customer;
import com.shop.model.Employee;
import com.shop.model.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcEmployeeRepository implements EmployeeRepository{

    @Override
    public Employee findByName(String name) {

        Employee emp = null;

        Connection connection = null;

        try {
            connection = MySQLConnectionFactory.getConnection();
            // step-3 :  create JDBC statements with SQL
            String sql = "select * from employees where name=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
            }
            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return emp;
    }

    @Override
    public void save(Employee emp) {
        Connection connection = null;
        try {
            connection = MySQLConnectionFactory.getConnection();
            // step-3 :  create JDBC statements with SQL
            String sql = "insert into employees (id, name) values (?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());

            // step-4 :  execute JDBC-statements & process results
            int rowCount = ps.executeUpdate();
            if (rowCount == 1)
                System.out.println("New Employee Hired ... :)");

            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void remove(Employee emp) {
        Connection connection = null;
        try {
            connection = MySQLConnectionFactory.getConnection();
            // step-3 :  create JDBC statements with SQL
            String sql = "delete from employees where id= ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, emp.getId());

            // step-4 :  execute JDBC-statements & process results
            int rowCount = ps.executeUpdate();
            if (rowCount == 1)
                System.out.println("Employee " + emp.getName() + "was fired ... :(");

            // step-5 : Handle SQL-exceptions
        } catch (SQLException e) {
            e.printStackTrace(); // print exception details in console
        } finally {
            // step-7 : close / release connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

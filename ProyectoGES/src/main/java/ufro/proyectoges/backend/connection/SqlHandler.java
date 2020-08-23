package ufro.proyectoges.backend.connection;



import javax.swing.*;
import java.sql.*;

public class SqlHandler {

    private Connection connection;
    private Statement statement;


    public SqlHandler(String ip, String databasename){
        try{

            attempToConnect(ip,databasename);
            createStatement();
        }catch (SQLException e){
            if (connection == null){
                JOptionPane.showMessageDialog(null, "Failed to stablish connection to database");
            }

        }catch (ClassNotFoundException nf){
            System.out.println("Wrong Class name");
        }

    }

    public Statement getStatement() {
        return statement;
    }

    private void attempToConnect(String ip, String tableName) throws java.sql.SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://"+ip+"/"+tableName,"root","");
    }

    private void createStatement() throws java.sql.SQLException{
        statement = connection.createStatement();
    }

    private void createIfDoesNotExistTable(String tableName) throws SQLException{

        statement.executeUpdate("CREATE TABLE " + tableName);
    }
    



}

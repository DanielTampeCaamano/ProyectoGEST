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
    
    public void insertInto(String table_name,String column_names,String values){
        
        try{
            statement.executeUpdate("INSERT INTO " +table_name+ " " +column_names+" VALUES " +values+";");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public ResultSet selectFrom(String selected_columns, String table_name){
        ResultSet queryResult = null;
        try{
            queryResult = statement.executeQuery("SELECT " +selected_columns+ " FROM " +table_name);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return queryResult;
    }
    
    public ResultSet selectFromWhere(String selected_columns, String table_name, String column_to_find, String value_expected){
        ResultSet queryResult = null;
        try{
            queryResult = statement.executeQuery("SELECT " +selected_columns+ " FROM " +table_name + " WHERE " +column_to_find+ "=" + value_expected + ";");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return queryResult;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shewa_robit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Efriem
 */
public class Database {
    private String forename = "com.mysql.jdbc.Driver";
    private Connection con;
    public String databaseStatus = "";
    Database(String userName, String password, String url)//constructor 
    {

        try {
            Class.forName(forename);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url, userName, password);
            databaseStatus = "Connected to the database..";
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            databaseStatus = "Database Connection Error...";
        }
    }
    public Connection connect() {
        return con;
    }

    public Statement statmen() {
        try {
            return con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        Database db = new Database("root", "", "jdbc:mysql://localhost:3307/Automation");
        System.out.println(db.databaseStatus);
    }
}

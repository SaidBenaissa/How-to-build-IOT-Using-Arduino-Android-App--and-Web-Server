/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shewa_robit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Efriem
 */
public class Shewa_Robit {

    /**
     * @param args the command line arguments
     */
public static BufferedReader input;
public static OutputStream output;
public static Statement statment;
public static ResultSet resultSet;
static boolean testLamp1 = false;
static boolean onLamp1 = false;
static boolean testLamp2 = false;
static boolean onLamp2 = false;
static boolean onLamp3 = false;
static boolean testLamp3=false;
static boolean testLamp4=false;
static boolean onLamp4 = false;
static boolean onAll=false;
static boolean testAll=false;
static boolean offAll = false;
static boolean test1All = false;
static boolean motorForward = false;
static boolean testMotor = false;


//static boolean off = true;
public static SerialClass obj = new SerialClass();

public static  void writeData(String data) {
System.out.println("Sent: " + data);
try {
output.write(data.getBytes());
} catch (Exception e) {
System.out.println("could not write to port");
}
}

public static void delay(int x)
{
  
    
while(x>0)
{
    x--;
}
}
    public static void main(String[] args) {
        obj.initialize();
        input = SerialClass.input;
        output = SerialClass.output;

    try {
        //Database db = new Database("root", "", "jdbc:mysql://localhost:3307/TestAndroid");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Automation", "root", "");
        statment = con.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Shewa_Robit.class.getName()).log(Level.SEVERE, null, ex);
    }
        String query="Select * from Parameters ";
        while(true)
        {
    try {
      resultSet = statment.executeQuery(query);
     
      while(resultSet.next())
      {
          //All Lamps On
          if(resultSet.getString("Motor").equals("1"))
          {
            testMotor=true;
          }
          else
          {
            testMotor=false;
          }
          
          //For Lamp1 
          if(resultSet.getString("Lamp1").equals("1"))
          {
          testLamp1 = true;
          }
          else
          {
          testLamp1 = false;
          }
          //For Lamp2
          if(resultSet.getString("Lamp2").equals("1"))
          {
          testLamp2 = true;
          }
          else
          {
          testLamp2 = false;
          }
          //Lamp3 
          if(resultSet.getString("Lamp3").equals("1"))
          {
          testLamp3 = true;
          }
          else
          {
          testLamp3 = false;
          }
          //Lamp 4
          if(resultSet.getString("Lamp4").equals("1"))
          {
          testLamp4 = true;
          }
          else
          {
          testLamp4 = false;
          }
      }
      
              try
{



//Lamp1
if((testLamp1==true)&&(onLamp1==false))
{
    onLamp1 = true;
    writeData("1");
}
else if((testLamp1==true)&&(onLamp1==true))
{  
   System.out.println("Lamp1 Already on");
}
else if((testLamp1==false)&&(onLamp1==false))
{
   System.out.println("Lamp1 Already Off");
}
else if((testLamp1==false)&&(onLamp1==true))
{
    onLamp1 = false;
    writeData("0");
}
//Lamp2
if((testLamp2==true)&&(onLamp2==false))
{
    onLamp2 = true;
    writeData("3");
}
else if((testLamp2==true)&&(onLamp2==true))
{  
   System.out.println("Lamp2 Already on");
}
else if((testLamp2==false)&&(onLamp2==false))
{
   System.out.println("Lamp2 Already Off");
}
else if((testLamp2==false)&&(onLamp2==true))
{
    onLamp2 = false;
    writeData("2");
}
//Lamp3
if((testLamp3==true)&&(onLamp3==false))
{
    onLamp3 = true;
    writeData("5");
}
else if((testLamp3==true)&&(onLamp3==true))
{  
   System.out.println("Lamp3 Already on");
}
else if((testLamp3==false)&&(onLamp3==false))
{
   System.out.println("Lamp3 Already Off");
}
else if((testLamp3==false)&&(onLamp3==true))
{
    onLamp3 = false;
    writeData("4");
}
//Lamp4
if((testLamp4==true)&&(onLamp4==false))
{
    onLamp4 = true;
    writeData("7");
}
else if((testLamp4==true)&&(onLamp4==true))
{  
   System.out.println("Lamp4 Already on");
}
else if((testLamp4==false)&&(onLamp4==false))
{
   System.out.println("Lamp4 Already Off");
}
else if((testLamp4==false)&&(onLamp4==true))
{
    onLamp4 = false;
    writeData("6");
}
//Motor Forward
if((testMotor==true)&&(motorForward==false))
{
    motorForward= true;
    writeData("8");
}
else if((testMotor==false)&&(motorForward==true))
{
    motorForward= false;
    writeData("9");
}

}
catch(Exception e){}
        
    } catch (SQLException ex) {
        Logger.getLogger(Shewa_Robit.class.getName()).log(Level.SEVERE, null, ex);
    }
            
        }
        //obj.close();
    }
    
}

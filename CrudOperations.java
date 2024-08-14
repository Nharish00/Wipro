package Assignment11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CrudOperations {
    public static void main(String[] args) throws Exception {
        // Load the Oracle JDBC driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

     
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

        Scanner sc = new Scanner(System.in);

        int input;

        do {
            System.out.println("Select the option: \n 1.Create 2.Read 3.Update 4.Delete 5.Exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter Student id (number): \nEnter Student name:");
                    int id = sc.nextInt();
                    String name = sc.next();

                    PreparedStatement psInsert = con.prepareStatement("insert into student values(?,?)");
                    psInsert.setInt(1, id);  
                    psInsert.setString(2, name);

                    int rowsInserted = psInsert.executeUpdate();
                    System.out.println(rowsInserted + " row(s) inserted.");
                    psInsert.close(); 
                    break;

                case 2:
                    System.out.println("Enter Student id to show (or 0 to read all):");
                    int readId = sc.nextInt();

                    if (readId == 0) {
                        PreparedStatement psSelectAll = con.prepareStatement("select * from student");
                        ResultSet rs = psSelectAll.executeQuery();

                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2));
                        }
                        rs.close();
                        psSelectAll.close();  
                    } else {
                        PreparedStatement psSelect = con.prepareStatement("select * from student where id = ?");
                        psSelect.setInt(1, readId);
                        ResultSet rs = psSelect.executeQuery();

                        if (rs.next()) {
                            System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2));
                        } else {
                            System.out.println("Student not found.");
                        }
                        rs.close();
                        psSelect.close();  
                    }
                    break;

                case 3:
                    System.out.println("Enter the Student id you want to update:");
                    int updateId = sc.nextInt();
                    System.out.println("Enter the new name:");
                    String newName = sc.next();

                    PreparedStatement psUpdate = con.prepareStatement("update student set name = ? where id = ?");
                    psUpdate.setString(1, newName);
                    psUpdate.setInt(2, updateId);  
                    int rowsUpdated = psUpdate.executeUpdate();
                    System.out.println(rowsUpdated + " row(s) updated.");
                    psUpdate.close(); 
                    break;

                case 4:
                    System.out.println("Enter the Student id you want to delete:");
                    int deleteId = sc.nextInt();

                    PreparedStatement psDelete = con.prepareStatement("delete from student where id = ?");
                    psDelete.setInt(1, deleteId);  
                    int rowsDeleted = psDelete.executeUpdate();
                    System.out.println(rowsDeleted + " row(s) deleted.");
                    psDelete.close(); 
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (input != 5);

       
        sc.close();
        con.close();
    }
}

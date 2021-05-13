package JDBC;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
public class JavaDB {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/company";
        String uname = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, uname, pass);
        Statement stmt = conn.createStatement();

        while(true) {
            System.out.println("Enter the details of employee to insert");
            System.out.print("eid:");
            int Ieid = sc.nextInt();
            sc.nextLine();
            System.out.print("name:");
            String Iname = sc.nextLine();
            System.out.print("phone:");
            String Iphone = sc.nextLine();
            System.out.print("salary:");
            int Isalary = sc.nextInt();
            String query = "INSERT INTO employee VALUES('" + Ieid + "','" + Iname + "','" + Iphone + "','" + Isalary + "');";
            stmt.executeUpdate(query);

            query = "select * from employee";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                int eid = rs.getInt("eid");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                int salary = rs.getInt("salary");
    
                System.out.println(eid + " " + name + " " + phone + " " + salary);
            }
            System.out.println("Insert again?(y/n)");
            char choice = sc.next().charAt(0);
            if(choice != 'y') break;
        }
        stmt.close();
        conn.close();
    }
}
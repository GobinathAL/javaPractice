package JDBC;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTDB {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/company";
        String uname = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, uname, pass);
        Statement stmt = conn.createStatement();
        
        Frame insertFrame = new Frame("Employee Registration");

        Label eidLabel = new Label("EID");
        eidLabel.setBounds(10, 50, 80, 30);
        TextField eidField = new TextField();
        eidField.setBounds(100, 50, 150, 30);

        Label nameLabel = new Label("Name");
        nameLabel.setBounds(10, 100, 80, 30);
        TextField nameField = new TextField();
        nameField.setBounds(100, 100, 150, 30);
        
        Label phoneLabel =  new Label("Phone");
        phoneLabel.setBounds(10, 150, 80, 30);
        TextField phoneField = new TextField();
        phoneField.setBounds(100, 150, 150, 30);

        Label salaryLabel = new Label("Salary");
        salaryLabel.setBounds(10, 200, 80, 30);
        TextField salaryField = new TextField();
        salaryField.setBounds(100, 200, 150, 30);

        Button insertButton = new Button("Insert");
        insertButton.setBounds(10,250,80,30);
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int eid = Integer.parseInt(eidField.getText());
                String name = nameField.getText();
                String phone = phoneField.getText();
                int salary = Integer.parseInt(salaryField.getText());
                String query = "INSERT INTO employee VALUES('" + eid + "','" + name + "','" + phone + "','" + salary + "');";
                try {
                    stmt.executeUpdate(query);
                    System.out.println("insert success");
                } catch (SQLException e1) { 
                    System.out.println("insert error");
                }

            } 
        });

        Button closeButton = new Button("Close");
        closeButton.setBounds(200,250,80,30);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    stmt.close();
                    conn.close();
                } catch(Exception ex) { }
                System.exit(0);
            }
        });

        Button viewButton = new Button("View Table");
        viewButton.setBounds(200, 350, 80, 30);
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    viewTable(stmt);
                } catch (Exception e1) { }
            }
        });
        insertFrame.setSize(400,400);
        insertFrame.setLayout(null);
        insertFrame.add(eidLabel);
        insertFrame.add(eidField);
        insertFrame.add(nameLabel);
        insertFrame.add(nameField);
        insertFrame.add(phoneLabel);
        insertFrame.add(phoneField);
        insertFrame.add(salaryLabel);
        insertFrame.add(salaryField);
        insertFrame.add(insertButton);
        insertFrame.add(closeButton);
        insertFrame.add(viewButton);
        insertFrame.setVisible(true);
    }

    static void viewTable(Statement stmt) throws Exception {
        Frame viewFrame = new Frame("Employee Table");
        String query = "select * from employee";
        ResultSet rs = stmt.executeQuery(query);
        String text = "";
        while(rs.next()) {
            text += rs.getInt("eid") + " " + rs.getString("name") + " " + rs.getString("phone") + " " + rs.getInt("salary") + "\n";
        }
        
        TextArea tableArea = new TextArea(text);
        tableArea.setBounds(50, 50, 250, 250);

        viewFrame.setSize(400, 400);
        viewFrame.setLayout(null);
        viewFrame.add(tableArea);
        viewFrame.setVisible(true);
        viewFrame.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowClosing(WindowEvent e) {
                viewFrame.dispose();
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
    }
}

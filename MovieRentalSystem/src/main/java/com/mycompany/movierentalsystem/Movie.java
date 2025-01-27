package com.mycompany.movierentalsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Movie extends JFrame implements ActionListener { 
    JFrame jf; 
    JTextField t1, t2, t3, t4; 
    JLabel l1, l2, l3, l4; 
    JButton b1;

    public Movie() { 
        jf = new JFrame("Movie Rental System"); 
        l1 = new JLabel("Title"); 
        l2 = new JLabel("Genre");  // Corrected typo here
        l3 = new JLabel("Language"); 
        l4 = new JLabel("Length"); 
        t1 = new JTextField(10); 
        t2 = new JTextField(10); 
        t3 = new JTextField(10); 
        t4 = new JTextField(10); 
        b1 = new JButton("ADD"); 

        jf.setLayout(new GridLayout(5, 2, 10, 10)); 
        jf.add(l1); 
        jf.add(t1); 
        jf.add(l2); 
        jf.add(t2); 
        jf.add(l3); 
        jf.add(t3); 
        jf.add(l4); 
        jf.add(t4); 
        jf.add(new JLabel());  
        jf.add(b1); 
        jf.setSize(400, 300); 
        b1.addActionListener(this); 
        jf.setVisible(true); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 

    public void actionPerformed(ActionEvent ae) { 
        try { 
            // Use MySQL driver instead of MariaDB
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // Use your MySQL credentials here
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie rental system", "root", ""); 
            System.out.println("Database connected successfully");

            // Insert statement for MySQL
            String sql = "INSERT INTO movie (Title, Genre, Language, Length) VALUES (?, ?, ?, ?)"; 
            PreparedStatement ps = conn.prepareStatement(sql); 
            
            // Set values from the text fields
            ps.setString(1, t1.getText()); 
            ps.setString(2, t2.getText()); 
            ps.setString(3, t3.getText()); 
            ps.setString(4, t4.getText()); 
            
            // Execute the update
            ps.executeUpdate(); 
            conn.close(); 
            System.out.println("Inserted successfully"); 
        } catch (Exception se) { 
            System.out.println("Error: " + se.getMessage()); 
            se.printStackTrace(); 
        } 
    }

    public static void main(String[] args) { 
        new Movie(); 
    }
}

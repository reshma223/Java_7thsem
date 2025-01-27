package com.mycompany.ubp;

import java.net.DatagramPacket; 
import java.net.DatagramSocket; 

public class Dreceiver { 
    public static void main(String[] args) throws Exception { 
        // Create a DatagramSocket on port 6666 to receive data
        DatagramSocket ds = new DatagramSocket(6666); 
        
        // Buffer to hold incoming data
        byte[] buf = new byte[1024]; 
        
        // Create a DatagramPacket for receiving data
        DatagramPacket dp = new DatagramPacket(buf, 1024); 
        
        // Receive the incoming packet
        ds.receive(dp); 
        
        // Convert the received byte array into a string
        String str = new String(dp.getData(), 0, dp.getLength()); 
        
        // Print the received message
        System.out.println("Received message: " + str); 
        
        System.out.println("Message received!"); 
        
        // Close the socket after receiving the message
        ds.close(); 
    } 
} 

package com.mycompany.ubp;

import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 

public class Dsender { 
    public static void main(String[] args) throws Exception { 
        // Create a DatagramSocket object for sending data
        DatagramSocket ds = new DatagramSocket(); 
        
        // Message to be sent
        String str = "Message sent by server"; 
        
        // Get local machine IP address
        InetAddress ip = InetAddress.getLocalHost(); 
        
        // Create a DatagramPacket with message, length, destination IP, and port number
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 6666); 
        
        // Send the packet
        ds.send(dp); 
        
        System.out.println("Message sent!"); 
        
        // Close the socket after sending the message
        ds.close(); 
    } 
} 

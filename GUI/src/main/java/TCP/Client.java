package TCP;

import java.io.*; 
import java.net.*; 
class Client 
{ 
            public static void main(String args[])throws IOException 
            { 
                        
                        Socket s=new Socket(InetAddress.getLocalHost(),1064); 
                        BufferedReader br; 
                        PrintStream ps; 
                        String str; 
                        System.out.println("Enter a number  :"); 
                        br=new BufferedReader(new InputStreamReader(System.in)); 
                        ps=new PrintStream(s.getOutputStream()); 
                        ps.println(br.readLine()); 
                        br=new BufferedReader(new InputStreamReader(s.getInputStream())); 
                        str=br.readLine(); 
                        System.out.println("The facorial of the number is : "+str); 
                        br.close(); 
ps.close(); 
} 
}
import java.io.FileOutputStream;
public class FileOutDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("abc.txt");
            String s="Rohit Sharma is my favorite player";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success....");
        } catch(Exception e){
            System.out.println("e");
            
        }
    }
    
}

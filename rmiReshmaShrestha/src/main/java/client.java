import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws RemoteException {
        client c = new client();
        c.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try {
            Scanner sc = new Scanner(System.in);  // Fixed capitalization
            Registry reg = LocateRegistry.getRegistry("localhost", 9999);
            adder ad = (adder) reg.lookup("hi server");  // Fixed class name capitalization
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Addition is: " + ad.add(a, b));
        } catch (NotBoundException | RemoteException e) {
            System.out.println("Exception: " + e);
        }
    }
}

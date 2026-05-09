import java.rmi.Naming;
import java.util.Scanner;

public class Client
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);

            AddInterface obj;

            obj = (AddInterface) Naming.lookup("rmi://localhost/abc");

            System.out.println("Enter First String:");
            String s1 = sc.nextLine();

            System.out.println("Enter Second String:");
            String s2 = sc.nextLine();

            String result = obj.add(s1, s2);

            System.out.println("Answer = " + result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

//Open Terminal in VS Code.
//javac *.java

//Open NEW terminal.
//rmiregistry

//Open NEW terminal.
//java Server

//Open NEW terminal.
//java Client

//SEQUENCE: INTERFACEJAVA,ADDSERVERJAVA,SERVERJAVA,CLIENTJAVA

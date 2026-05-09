import java.rmi.Naming;

public class Server
{
    public static void main(String args[])
    {
        try
        {
            AddServer obj = new AddServer();

            Naming.rebind("abc", obj);

            System.out.println("Server Started");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

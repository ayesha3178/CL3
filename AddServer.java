import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServer extends UnicastRemoteObject
implements AddInterface
{
    AddServer() throws RemoteException
    {
        super();
    }

    public String add(String a, String b)
    {
        return a + b;
    }
}
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInterface extends Remote
{
    String add(String a, String b) throws RemoteException;
}
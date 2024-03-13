import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {
    public Reverse() throws RemoteException {
    }

    @Override
    public String reverseString(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}

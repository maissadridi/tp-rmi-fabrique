import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

@SuppressWarnings("unused")
public class ReverseServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Serveur : Construction de l'implementation ");
            FabReverseImpl fab = new FabReverseImpl();
            System.out.println("Objet Fabrique lie dans le RMIregistry");
            registry.rebind("Fabrique", fab);
            System.out.println("Serveur pret.");
            System.out.println("Attente des invocations des clients ...");

        } catch (Exception e) {
            System.out.println("Erreur de liaison de lobjet Fabrique");
            System.out.println(e.toString());
        }
    }

}

import java.rmi.*; 
public interface Adder extends Remote{ 
public int add(int[] internal,int[] external,int n)throws RemoteException;

}

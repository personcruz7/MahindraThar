import java.rmi.*; 
import java.rmi.server.*; 
import java.util.Arrays;

public class AdderRemote extends UnicastRemoteObject implements Adder{ 
AdderRemote()throws RemoteException{ 
super(); 
} 
public int add(int[] internal,int[] external,int n){
      int internalSum=Arrays.stream(internal).sum();
	int externalSum=Arrays.stream(external).sum();
	return (externalSum+internalSum)/n;
}}

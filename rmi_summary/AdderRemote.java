import java.rmi.*; 
import java.rmi.server.*; 
public class AdderRemote extends UnicastRemoteObject implements Adder{ 
AdderRemote()throws RemoteException{ 
super(); 
} 
public int add(int[] arr){
	int sum = 0; // initialize sum
      	int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
        }
}

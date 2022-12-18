import java.rmi.*; 
import java.util.Scanner;
public class MyClient{ 
public static void main(String args[]){ 
try{ 
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo"); 
Scanner s = new Scanner(System.in);
System.out.println("Enter number:");
int n=s.nextInt();  
int[] array = new int[n]; 
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{   
array[i]=s.nextInt();  
}  
System.out.println("Sum of array is:"+stub.add(array));
}catch(Exception e){} 
}
}

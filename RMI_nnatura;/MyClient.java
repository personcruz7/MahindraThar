import java.rmi.*;  
import java.util.Scanner;
public class MyClient{  
public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");  
Scanner s = new Scanner(System.in);
System.out.println("Enter number:");
int n=s.nextInt();
System.out.println("Sum of"+n+" Natural Number is :");
System.out.println(stub.add(n));  
}catch(Exception e){}  
}  
}  


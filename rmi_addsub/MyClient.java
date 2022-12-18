import java.rmi.*; 
import java.util.Scanner;
public class MyClient{ 
public static void main(String args[]){ 
try{ 
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo"); 
Scanner s = new Scanner(System.in);
System.out.println("Enter number:");
int x=s.nextInt();
int y=s.nextInt();
System.out.println("Sum of "+x+" and "+y+" is :");
System.out.println(stub.add(x,y));
System.out.println("Difference of "+x+" and "+y+" is :");
System.out.println(stub.Sub(x,y)); 
}catch(Exception e){} 
} 
}

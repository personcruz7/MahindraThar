import java.rmi.*; 
import java.util.Scanner;
public class MyClient{ 
public static void main(String args[]){ 
try{ 
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo"); 
Scanner s = new Scanner(System.in);
System.out.println("Enter number of Subject:");
int n=s.nextInt();  
int[] i= new int[n],e=new int[n]; 
System.out.println("Enter the internal Marks (out of 20): ");  
for(int j=0; j<n; j++)  
{   
i[j]=s.nextInt();  
}  
System.out.println("Enter the external Marks (out of 80): ");  
for(int j=0; j<n; j++)  
{   
e[j]=s.nextInt();  
}  
System.out.println("Score of student is(Percentage) : "+stub.add(i,e,n));
}catch(Exception e){} 
} 
}

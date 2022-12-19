import static java.lang.System.exit;
import java.util.Scanner;
public class ring1
{
    static int n,front=0,rear=0,ch,maxi=0,cord;
    static int[][] cq;
    public static void main(String[] args) 
    {
        int a=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of processes : ");
        cord=n=scanner.nextInt();
        cq=new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
          System.out.println("Enter the  process no : ");
          cq[i][0]=scanner.nextInt();
          System.out.println("Enter the state of process : ");
          cq[i][1]=scanner.nextInt();
        }
        display();
        while(a==1)
        {
              System.out.print("\n1.Crash \n2.Activate\n3.Election\n4.Quit");
              System.out.print("\nEnter the choice : ");
              ch=scanner.nextInt();
              switch(ch)
              {
                    case 1 : 
                            System.out.println("Enter the process no you want to crash : ");
                            //int x=scanner.nextInt();
                            crash(scanner.nextInt());   
                            break;

                    case 2 :
                            System.out.println("Enter the process no you want to activate : ");
                            activate(scanner.nextInt());
                            break;
                    case 3 :
                            if(cq[cord][1]==1)
                            {
                                System.out.println("\n No need to start election.");
                            }
                            else
                            {
                                System.out.println("Enter the process no initiate election : ");
                                int x2=scanner.nextInt();
                                while(cq[x2][1]==0)
                                {
                                    System.out.println("Process "+x2 +" is crash and cannot start election");
                                    System.out.println("Enter another Process :");
                                    x2=scanner.nextInt();
                                }
                                dis(x2);
                            }
                            break;
                    case 4: 
                            exit(0);
                            break;
              }
              System.out.print("\nDo you want to continue : ");
              a=scanner.nextInt();
         }
    }
    public static void crash(int x)
    {
        for(int i=0;i<=n;i++)
        {
            if(cq[i][0]==x)
            {
                if(cq[i][1]==0)
                {
                    System.out.println("Already crashed");
                    break;
                }
                else
                {
                    cq[i][1]=0;
                    display();
                    break;
                }
            }
        }
    }
    public static void activate(int x)
    {
        for(int i=0;i<=n;i++)
        {
            if(cq[i][0]==x)
            {
                if(cq[i][1]==1)
                {
                    System.out.println("Already activated");
                    break;
                }
                else
                {
                    cq[i][1]=1;
                    display();
                    break;
                }
            }
        }
    }

    public static void display()
    {
           System.out.print("\nProcess    : ");
           for(int i=1;i<=n;i++)
           {
               System.out.print("\tP"+i);
           }
           System.out.print("\nStatus     : ");
           for(int i=1;i<=n;i++)
           {
               System.out.print("\t"+cq[i][1]);
           }
           System.out.print("\nIdentifier : ");
           for(int i=1;i<=n;i++)
           {
               System.out.print("\t"+cq[i][0]);
           }
    }
    public static void dis(int x)
    {
        front=x;
	for(int i=front;i<=n;i++)
        {
            if(cq[i][1]!=0)
            {
                maxi=Math.max(maxi, cq[i][0]);
            }
        }     
        
        System.out.println("\nNew Co-ordinator is : "+maxi);
    }
}



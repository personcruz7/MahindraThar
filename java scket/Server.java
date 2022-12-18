import java.net.*;
import java.io.*;

public class Server
{
public static void main(String[] args)  throws IOException
{
ServerSocket ss=new ServerSocket(1200);
Socket s= ss.accept();

System.out.print("Client Connected\n");

InputStreamReader in=new InputStreamReader(s.getInputStream());
BufferedReader bf=new BufferedReader(in);

String str=bf.readLine();

System.out.print("Client :"+ str);


PrintWriter pr=new PrintWriter(s.getOutputStream());
pr.println("Yes");
pr.flush();
}
}


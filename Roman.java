import java.io.*;
import java.util.*;
public class Roman
{
  final static char symbol[]={'L','X','V','I'};
  final static int value[]={50,10,5,1};
    public static int valueOf(String roman)
    {
     roman=roman.toUpperCase();
     if(roman.length()==0)
       return 0;
     for(int i=0;i<symbol.length;i++)
     {
      int pos=roman.indexOf(symbol[i]);
      if(pos>=0)
          return value[i]-valueOf(roman.substring(0,pos))+valueOf(roman.substring(pos+1));
     }
     throw new IllegalArgumentException("Invalid Roman Symbol.");
    }
    public static void main(String args[])
    {
     String str;
     System.out.println("Input");
     Scanner in=new Scanner(System.in);
     str=in.nextLine();
     System.out.println(valueOf(str));
    }
}

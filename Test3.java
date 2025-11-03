import java.util.Scanner;
import java.math.*;
import java.utli.*;
public class Test3{
public static void main(String[]args)
{
double a,b,s,c,area;
Scanner scan=new Scanner(System.in);
System.out.print("a=");
a=scan.nextDouble();
System.out.print("c=");
c=scan.nextDouble();
System.out.print("b=");
b=scan.nextDouble();
s=(a+b+c)/2;
area =Maths.sqrt(s*(s-a)*(s-b)*(sc));
System.out.println("area="+area);
}    
}

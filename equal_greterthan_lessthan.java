import java.util.Scanner;
public class equal_greterthan_lessthan
{
public static void main(String args[])
{
Scanner rohit=new Scanner(System.in);
System.out.print("Enter the value of a:");
int a=rohit.nextInt();
System.out.print("Enter the value of b:");
int b=rohit.nextInt();
if(a==b)
{
System.out.println("equl");
}
else
{
System.out.println("not equal");
}
if(a>b)
{
System.out.println("greater is a:"+a);
}
else
{
System.out.println("greater is b:"+b);
}

}

}
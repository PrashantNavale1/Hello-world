import java.util.Scanner;
class SwapNoTemp{
public static void main(String[] args)
{
int a, b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st Number a : ");
a = sc.nextInt();
System.out.println("Enter 2nd Number b : ");
b = sc.nextInt();
a = a+b;
b = a-b;
a = a-b;
System.out.println("Swapped Number a is : " +a); 
System.out.println("Swapped Number b is : " +b); 
}
}	
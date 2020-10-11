import java.util.Scanner;
class SwapNumber
{
public static void main(String[] args){
int a, b;
int temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the 1st Number a = ");
a= sc.nextInt();
System.out.println("Enter the 1st Number b = ");
b= sc.nextInt();

temp = a;
a= b;
b= temp;
System.out.println("Swapped Number a = "  +a);
System.out.println("Swapped Number b = " +b);
}
}



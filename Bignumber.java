import java.util.Scanner;
class Bignumber
{
public static void main(String[] args){

int a, b , c;
Scanner sc = new Scanner(System.in);
System.out.println(" Enter Number a: ");
a= sc.nextInt();
System.out.println(" Enter Number b: ");
b= sc.nextInt();
System.out.println(" Enter Number c: ");
c= sc.nextInt();
if (a > b && a > c) {
System.out.println(a + " is bigger number ");
}
else if (b > a && b > c) {
System.out.println(b + " is bigger number ");
}
else {
System.out.println(c + " is bigger number ");
}
}
}
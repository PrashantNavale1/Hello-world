import java.util.Scanner;
class Avg_Sum
{
public static void main(String[] args){
int i, n;
int sum =0;
float avg;
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many number ");
n=sc.nextInt();
for(i=1; i<=n;i++)
{
System.out.println("Enter "+i +"th number ");
i=sc.nextInt();
}

for (i=1; i<=n;i++)
{
sum = sum+i;
}
avg = sum/n;
System.out.println("Sum of the numbers is " +sum);
System.out.println("Avg of the numbers is " +avg);
}
}
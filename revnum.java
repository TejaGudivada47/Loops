import java.util.Scanner;
class Reverse{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt();
int n1,rev=0,rem;
 n1=n;
while(n>0){
rem = n%10;
System.out.print(" "+rem);
rev=rem*rem*rem+rev;
n=n/10;
}
}
}
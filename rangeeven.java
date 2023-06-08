import java.util.Scanner;
class Print{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first limit : ");
int x=sc.nextInt();
System.out.print("Enter second limit : ");
int y=sc.nextInt();
System.out.print("Even numbers in the given range is : ");
for(int i=x;i<=y;i++){
if(i%2==0){
System.out.print(" "+i);
}
}
}
}
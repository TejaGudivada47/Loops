import java.util.Scanner;
class Sum{
public static void main(String [] args){
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter range");
int num=sc.nextInt();
for(int i =1;i<=num;i++){
sum = sum+i;
}
System.out.println("sum is : "+sum);
}
}
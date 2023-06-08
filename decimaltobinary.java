import java.util.Scanner;
class binary{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter decimal number");
int n1=sc.nextInt();
int i=0;
int binary[]=new int[100];
while(n1!=0){
binary[i]=n1%2;
n1=n1/2;
i++;
}
System.out.println("binary value is :");
for( int j=i-1;j>=0;j--){
System.out.print(" "+binary[j]);
}
}
}
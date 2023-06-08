import java.util.Scanner;
class Tables{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Which table you want");
int num=sc.nextInt();
for(int i =1;i<21;i++){
System.out.println(num+"*"+i+"="+(num*i));
}
}
}
import java.util.*;
class Input{
public static void main(String []args){
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 numbers");
for(int i=0;i<5;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<5;i++){
System.out.println("arr["+i+"]="+a[i]);
}
}
}

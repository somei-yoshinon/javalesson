
import java.util.*;
public class Main6{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
System.out.print("正の整数");
int a=sc.nextInt();

 System.out.println(numOf(a));
}
public static int numOf(int a){
	int num=0;
for(int i=a;a>0;a--){
if(a%2!=0 && a%3!=0){
	a=num;
break;
}
}
return num;
}
}

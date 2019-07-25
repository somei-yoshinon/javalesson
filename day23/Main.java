import java.util.*;
public class Main{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
System.out.print("正の整数");
int a=sc.nextInt(); 
countdown(a);
}
public static void countdown(int a){
if(a==1){
	System.out.print(a);
}else{
	System.out.println(a--);
	countdown(a);
}
} 
}


import java.util.*;
public class Main2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("正の整数");
int a=sc.nextInt();
System.out.println(sumOf(a));
count(spm);
}
static int count(int a){		
	if(a==1){
		return a;
	}else{
		return n+sumOf(a-1);
	}
}
}

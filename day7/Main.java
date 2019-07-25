import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int count=0;
		int num =r.nextInt(100)+1;
		System.out.println("1~100の番号を決めたよ当ててね");
		do{
			count++;
			System.out.println("いくつかな>");
			int a=sc.nextInt();
		if(a==num){
		System.out.println("当たり");
		}else if(num>a){
			System.out.println("もっと下だよ");
		}else if(num<a){
			System.out.print.ln("もっと上だよ");
		}while(count<5);
		System.out.println("残念");
		}
	}
	










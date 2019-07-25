
import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数A");
		int a=sc.nextInt();
		System.out.print("整数B");
		int b=sc.nextInt();
		do {
			System.out.print("番号を入力1和2差3積4最大公約数5終了");
			int c=sc.nextInt();
			if(c==1){
				System.out.println(a+b);
			}else if(c==2 && a<b){
				System.out.println(b-a);
			}else if(c==2 && a>b){
				System.out.println(a-b);
			}else if(c==3){
				System.out.println(a*b);
			}else if(c==4){
				System.out.println(gcd(b));
			}
		}

			}while(c!=5);

				System.out.println("終了");
			
static int gcd(int a,int b){
int temp;
while((temp = a%b)!=0){
a = b;
b=temp;
}
return b;
}
}


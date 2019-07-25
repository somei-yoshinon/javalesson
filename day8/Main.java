import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("正の整数>");
        int a=sc.nextInt();
    int b=1;
	int c=5;
    int d=3;
        while(a>b){
			b++;
            System.out.println(b);
            if(c*=5){
				
                System.out.print("Fizz");
            }else if(d*=3){
				
                System.out.print("Buzz");
            }else if(c*=5 && d*=3){
				System.out.print("FizzBuzz");
                
            }
        }
    }
}

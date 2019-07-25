import java.util.*;
public class Main5{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("整数A");
	int a=sc.nextInt();
	System.out.print("整数b");
nt b=sc.nextInt();
System.out.println("gcdは"+gcdOf(a,b)+"です");
}
static int gcdOf(int a,int b){
	int mod=a%b
	if(a%==0 && b%==0){
		return b; 
	}else{
		return gcdOf(b,mod);
	}

	
}
}
}
}


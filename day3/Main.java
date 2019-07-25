public class Main{
public static void main(String[] args){
		
	char a='木';
	char b='村';
	char c='佑';
	char d='一';
	int sum=a+b+c+d;

	int ave=sum/4;
	System.out.println("木"+(int)a);
	System.out.println("村"+(int)b);
	System.out.println("佑"+(int)c);
	System.out.println("轟"+(int)d);
	int max=Math.max(Math.max(a,b),Math.max(c,d));

	System.out.println(max);

}
}


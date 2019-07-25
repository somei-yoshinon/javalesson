import java.util.*;
public class Piko{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("右手に何を持ちますか>");
String right=sc.nextLine();
System.out.println("i have a "+right);
System.out.print("左手に何を持ちますか>");
String left=sc.nextLine();
System.out.println("i have a "+left);
System.out.println(left+right+"!");
System.out.print("左手に何を持ちますか>");
String left2=sc.nextLine();
System.out.println("i have a "+left2);
System.out.print("右手に何を持ちますか>");
String right2=sc.nextLine();
System.out.println("i have a "+right2);
System.out.println(right2+left2+"!");

String a=left+right;
String b=right2+left2;
String c=left2+right2+left+right;

System.out.println("");
System.out.println(a+"-"+b);
System.out.println("");
System.out.println(c);
}
}

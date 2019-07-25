import java.util.*;
public class Main3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("何日分のデータを入力しますか>");
int days=sc.nextInt();
int a=0;
double[] weights=new double[days];
for(int i=0;i<weights.length;i++){
System.out.print(i+1+"日目:");
weights[i]=sc.nextDouble();
System.out.println("体重結果");
for(int j=days;a<j;a++){
System.out.println(j+1+"日目["+weights[::i]+"]");
}
}
}
}

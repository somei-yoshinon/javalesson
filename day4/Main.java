import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("体重(kg)>");
        double x=sc.nextDouble();
System.out.print("身長(cm)>");
        double y=sc.nextDouble();
double r=(y/100)*(y/100);
double bmi=x/r;
        System.out.printf("あなたのBMIは%.2fです",bmi);
    }
}


import java.util.Random;
public class Main2{
public static void main(String[]args){
String[] fortunes={"大吉","中吉","小吉","凶"};
Random rand=new Random();
int index=rand.nextInt(fortunes.length); 
System.out.println("本日の後ろは"+fortunes[index]);
} 
 
}

import java.util.*;
public class Main{
public static void main(){
}
}
outer:while(true){
		  sc.nextLine();
            int n=rand.nextInt(4);
            boolean isAttack=false;
            switch(n){
            case 0:
            case 1:
                int tN=rand.nextInt(2);
                if(tN==0 && t1.isAlive){
                    h.attack(t1,"くらえ");
                    isAttack=true;
                }else if(tN==1 && t2.isAlive){
                    h.attack(t2,"こらぁ");
                    isAttack=true;
                }
                if(t1.isAlive==false && t2.isAlive==false){
                    System.out.println("相手を倒した!!");
					System.out.println("Win!!");
                    break outer;
                }
                break;
            case 2:
                if(t1.isAlive){
                    t1.attack(h);
isAttack=true;
                }
                if(h.isAlive==false){
                    System.out.println("勇者はもういない");
                    System.out.println("You Lose");
                    break outer;
                }
                break;
            case 3:
                if(t2.isAlive){
                    t2.attack(h);
                    isAttack=true;
                }
                if(h.isAlive==false){
                    System.out.println("勇者はもういない");
                    System.out.println("You Lose");
                    break outer;
                }
                break;

            }
            if(isAttack){
                System.out.println("************************");
                h.showStatus();
                t1.showStatus();
                t2.showStatus();
                System.out.println("************************");
            }
        }

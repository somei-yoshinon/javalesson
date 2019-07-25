public class Main{
public static void main(String[]args){
Hero h=new Hero();
h.name="ミナト";
h.hp=100;
System.out.println("勇者"+h.name+"生み出しました");
Hero h2=new Hero();
h2.name="ロト";
h2.hp=10000;
System.out.println("勇者"+h2.name+"を生み出しました");
h.slip();
h2.sit(10);
System.out.println(h.name+"のHp"+h.hp);
System.out.println(h2.name+"のHp"+h2.hp);
Hero h3=new Hero();
h3.name="ジェシカ";
h3.hp=20;
h3.sleep();
h3.run();
Cleric cl=new Cleric();
cl.name="エルス";
cl.hp=30;
cl.mp=10;
cl.selfAid();
cl.pray(2);
System.out.printf("%sのｈｐ:%d,mp:%d%n",cl.name,cl.hp,cl.mp);
}
}

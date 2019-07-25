public class Tomato{
    String name;
    int hp;
    int attackPower;
    boolean isAlive=true;
	Tomato(String name,int hp,int attackPower){
this.name=name;
this.hp=hp;

	}
    void attack(Hero h){
		System.out.print(this.name+"が"+h.name+"をこうげき");
        System.out.println("くらぇ！");
        h.hp-=this.attackPower;
        int dice=new java.util.Random().nextInt(10);
        int ap;
        if(dice==0){
            ap=this.attackPower*2;
            System.out.println("会心の攻撃！！");
        }else{
            ap=this.attackPower+new java.util.Random().nextInt(5)-2;
        }
        h.hp-=ap;
        if(h.hp<=0){
            System.out.println(h.name+"は倒れた");
            h.isAlive=false;
        }
    }
}

public class Janken {
  static String[] handList = {"グー","チョキ","パー"};

  static void startMessage() {
  }

  static void endMessage() {
    System.out.println("ありがとうございました！また遊びましょうね！");
  }

  public static void main(String[] args) {
    Player player = new Player();
    CPU cpu = new CPU();
    Judge judge = new Judge();

    startMessage();

    for (int i = 1; i <= 3; i++) {
     System.out.println("【" + i + "回戦目】");

     cpu.setHand();
     player.setHand();
     System.out.println("・あなたの手：" + handList[player.getHand()]);
     System.out.println("・わたしの手：" + handList[cpu.getHand()]);
     judge.judgement(cpu.getHand(), player.getHand());
	}
    judge.result();
    endMessage();
  }
}

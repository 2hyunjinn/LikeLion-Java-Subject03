package ex02;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        System.out.println("\n===============================\n");
        player.setLevel(Player.ADVANCED_LEVEL);
        player.play(2);
        System.out.println("\n===============================\n");
        player.setLevel(Player.SUPER_LEVEL);
        player.play(3);
    }
}

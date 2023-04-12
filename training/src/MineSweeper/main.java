package MineSweeper;

public class main {
    public static void main(String[] args) {
        Game mineSweeper = new Game();
        String[][] panel = mineSweeper.createPanel();
        String[][] bombapanel = new String[mineSweeper.satir][mineSweeper.sutun];
        bombapanel = mineSweeper.create(bombapanel);
        mineSweeper.BombPanel(bombapanel);//bombapanele bombaları yerleştiriyor
        while (mineSweeper.control){
            System.out.println("======================");
            mineSweeper.startGame(panel,bombapanel);

        }

    }
}

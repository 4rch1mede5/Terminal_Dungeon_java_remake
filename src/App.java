import javax.swing.*;
public class App{
    public static void main(String[] args) throws Exception{
        int windowHeight = 1020;
        int windowWidth = 1020;
        JFrame window = new JFrame("Dungeon");
        window.setSize(windowWidth, windowHeight);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Game dungeon = new Game();
        window.add(dungeon);
        window.pack();
        dungeon.requestFocus();
        window.setVisible(true);
    }
}

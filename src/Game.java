import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel implements ActionListener, KeyListener{
    int windowHeight = 1020;
    int windowWidth = 1020;
    Image floorImg;
    Image wallImg;
    Image rockImg;
    Image playerImg;
    Image lavaImg;
    Game(){
        setPreferredSize(new Dimension(windowWidth, windowHeight));
        setFocusable(true);
        addKeyListener(this);
        setBackground(Color.black);
        floorImg = new ImageIcon(getClass().getResource("./floor.png")).getImage();
        wallImg = new ImageIcon(getClass().getResource("./wall.png")).getImage();
        rockImg = new ImageIcon(getClass().getResource("./rock.png")).getImage();
        playerImg = new ImageIcon(getClass().getResource("./player.png")).getImage();
        lavaImg = new ImageIcon(getClass().getResource("./lava.png")).getImage();
    }
    

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    @Override
    public void keyTyped(KeyEvent e) {
        //none
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //none
    }
}

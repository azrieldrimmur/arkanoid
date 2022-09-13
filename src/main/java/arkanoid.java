import javax.swing.*;

public class arkanoid {
    public  static final int WIDTH =410;
    public  static final int HEIGHT =450;
    public static void main(String[] args) {
        JFrame frame = new JFrame("coolest game");
        arkanoid game =new arkanoid();
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

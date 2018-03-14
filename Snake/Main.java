import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.event.*;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    Snake snake = new Snake();
    Frame f = new Frame();
    f.add(snake);
    f.setVisible(true);// because by defualt its hidden
    f.setSize(600,600);// setting the size
    f.setTitle("Snake");
    //f.setBackground(Color.black);
    //snake.paintComponent();
  }
}

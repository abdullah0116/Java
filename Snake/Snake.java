import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.event.*;
import javax.swing.*;

public class Snake extends JPanel{

  public void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.setBackground(Color.black);
      g.setColor(Color.WHITE);
      g.fillRect(25, 25, 10, 10);
    }
}

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Diamond extends CanvasShape {
  public Diamond(int topLeftX, int topLeftY, int width, int height) {
    super(topLeftX, topLeftY, width, height);
  }

  public void render(Graphics2D graphics) {
    graphics.setColor(Color.WHITE);
    GeneralPath path = new GeneralPath();
    path.moveTo(getTopLeftX() + (getWidth() * 0.5), getTopLeftY()); // top middle
    path.lineTo(getTopLeftX() + getWidth(), getTopLeftY() + (getHeight() * .5)); // bottom right
    path.lineTo(getTopLeftX() + (getWidth() * 0.5), getTopLeftY() + getHeight());
    path.lineTo(getTopLeftX(), getTopLeftY() + (getHeight() *.5));
    path.closePath();
    graphics.fill(path);
  }
}

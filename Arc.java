import java.awt.*;

/**
 * Class Rectangle:  inherits from Shape and draws a rectangle
 * @author Barb Ericson
 */
public class Arc extends Shape {
  /** Constructor */
  private int startAngle;
  private int endAngle;
  public Arc() {
    super();
    startAngle = 30;
    endAngle = 70;
  }

  /** Draw the shape
   * @param g   the graphics context on which to draw
   */
  @Override
  public void draw(Graphics g) {
    // set the color
    g.setColor(Color.RED);
    
    // draw the rectangle given the top left point and width and height
    g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, endAngle); // the getter methods here are INHERITED FROM SHAPE!
  }
}



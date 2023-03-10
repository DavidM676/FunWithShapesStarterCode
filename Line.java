import java.awt.*;

/**
 * Class Rectangle:  inherits from Shape and draws a rectangle
 * @author Barb Ericson
 */
public class Line extends Shape {
  /** Constructor */

  public Line() {
    super();

  }

  /** Draw the shape
   * @param g   the graphics context on which to draw
   */
  @Override
  public void draw(Graphics g) {
    // set the color
    g.setColor(Color.BLUE);
    
    // draw the rectangle given the top left point and width and height
    g.drawLine(getP1X(), getP1Y(), getP2X(), getP2Y()); // the getter methods here are INHERITED FROM SHAPE!
  }
}



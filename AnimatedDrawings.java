import java.awt.Color;
import java.util.Random;

public class AnimatedDrawings
{

  public static void main(String[] args)
  {
    Canvas frame = new Canvas();

    // frame.setBounds(framex, framey, framew, frameh);

    ///////////////////////////////////////////////////////
    
    Random rand = new Random();
    
    Circle c = new Circle();
    c.PosX = 200;
    c.PosY = 200;
    c.Radius = 50;
    c.BorderWidth = 10;
    c.InternalColor = Color.BLUE;
    c.BorderColor = Color.YELLOW;
    c.Speed = -3;

    frame.AddFigure(c);

   

    int i;
    for (i = 0; i < 10; i++)
    {
      c = new Circle();
      c.PosX = rand.nextInt(500);
      c.PosY = rand.nextInt(500);
      c.Radius = rand.nextInt(50);
      c.Speed = rand.nextInt(10);

      float r = rand.nextFloat();
      float g = rand.nextFloat();
      float b = rand.nextFloat();

      Color randomColor = new Color(r, g, b);

      c.InternalColor = randomColor;
      
      frame.AddFigure(c);
    }

    
    ///////////////////////////////////////////////////////

    frame.setVisible(true);

    frame.StartAnimation();
  }

}

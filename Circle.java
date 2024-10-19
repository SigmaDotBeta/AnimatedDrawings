import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Circle extends GeometricFigure
{
  int Radius;
  int PosX;
  int PosY;

  Color InternalColor;

  int BorderWidth;
  Color BorderColor;
  
  int Speed = 0;

  private Random rand;

  public Circle()
  {
    rand = new Random();

    Radius = 0;
    PosX = 0;
    PosY = 0;
    InternalColor = Color.WHITE;

    BorderWidth = 2;
    BorderColor = Color.BLACK;
  }

  @Override
  public void DrawFigure(Graphics g)
  {
    g.setColor(this.BorderColor);
    g.fillOval(PosX - Radius - BorderWidth, PosY - Radius - BorderWidth, 2 * (Radius + BorderWidth), 2 * (Radius + BorderWidth));

    g.setColor(this.InternalColor);
    g.fillOval(PosX - Radius, PosY - Radius, 2 * Radius, 2 * Radius);
  }

  @Override
  public void UpdateFigure()
  {
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    
    Color randomColor = new Color(r, g, b);
    
    this.BorderColor = randomColor;
    
    if (this.Speed >= 0)
    {
      if (frame.MousePositionX > PosX)
        PosX+=Speed;
      if (frame.MousePositionX < PosX)
        PosX-=Speed;
      if (frame.MousePositionY > PosY)
        PosY+=Speed;
      if (frame.MousePositionY < PosY)
        PosY-=Speed;
    }
    
    if (this.Speed == -1)
    {
      PosX = frame.MousePositionX;
      PosY = frame.MousePositionY;
    }

    if (this.Speed == -2)
    {
      PosX = frame.MouseClickX;
      PosY = frame.MouseClickY;
    }

    if (this.Speed == -3)
    {
      if (frame.KeyboardLeft)
        PosX -= 10;
      if (frame.KeyboardRight)
        PosX += 10;
      if (frame.KeyboardUp)
        PosY -= 10;
      if (frame.KeyboardDown)
        PosY += 10;

      if (frame.KeyboardSpace)
        InternalColor = Color.BLACK;
      
      if (frame.KeyboardPressed == KeyEvent.VK_A)
        InternalColor = Color.RED;
      
      if (frame.KeyboardPressed == KeyEvent.VK_Z)
        InternalColor = Color.YELLOW;
    }
  }
}

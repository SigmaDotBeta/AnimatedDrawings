import java.awt.Graphics;

abstract public class GeometricFigure
{
    protected Canvas frame;
    
    abstract public void DrawFigure(Graphics g);
    abstract public void UpdateFigure();
}

/* Stefano Bertoncello */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseControl implements MouseListener, MouseMotionListener
{
  public Canvas frame;

  @Override
  public void mouseClicked(MouseEvent me)
  {
  }

  @Override
  public void mousePressed(MouseEvent me)
  {
    frame.MouseClickX = me.getX();
    frame.MouseClickY = me.getY();
  }

  @Override
  public void mouseReleased(MouseEvent me)
  {
  }

  @Override
  public void mouseEntered(MouseEvent me)
  {
  }

  @Override
  public void mouseExited(MouseEvent me)
  {
  }

  @Override
  public void mouseDragged(MouseEvent me)
  {
  }

  @Override
  public void mouseMoved(MouseEvent me)
  {
    frame.MousePositionX = me.getX();
    frame.MousePositionY = me.getY();
  }
  
}

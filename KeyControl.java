/* Stefano Bertoncello */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener
{

  public Canvas frame;
  
  @Override
  public void keyTyped(KeyEvent ke)
  {
  }

  @Override
  public void keyPressed(KeyEvent ke)
  {
    int tasto = ke.getKeyCode();
    
    //System.out.println("Key pressed code=" + ke.getKeyCode() + ", char=" + ke.getKeyChar());

    if (tasto == KeyEvent.VK_RIGHT)
    {
      frame.KeyboardRight = true;
    }
    if (tasto == KeyEvent.VK_LEFT)
    {
      frame.KeyboardLeft = true;
    }
    if (tasto == KeyEvent.VK_DOWN)
    {
      frame.KeyboardDown = true;
    }
    if (tasto == KeyEvent.VK_UP)
    {
      frame.KeyboardUp = true;
    }
    if (tasto == KeyEvent.VK_SPACE)
    {
      frame.KeyboardSpace = true;
    }
    
    frame.KeyboardPressed = tasto;
  }

  @Override
  public void keyReleased(KeyEvent ke)
  {
    int tasto = ke.getKeyCode();
    
    //System.out.println("Key released code=" + ke.getKeyCode() + ", char=" + ke.getKeyChar());

    if (tasto == KeyEvent.VK_RIGHT)
    {
      frame.KeyboardRight = false;
    }
    if (tasto == KeyEvent.VK_LEFT)
    {
      frame.KeyboardLeft = false;
    }
    if (tasto == KeyEvent.VK_DOWN)
    {
      frame.KeyboardDown = false;
    }
    if (tasto == KeyEvent.VK_UP)
    {
      frame.KeyboardUp = false;
    }
    if (tasto == KeyEvent.VK_SPACE)
    {
      frame.KeyboardSpace = false;
    }
   
    frame.KeyboardPressed = 0;
  }

}

package Racing3.Input;

import java.awt.event.*;


public class Input extends Thread implements KeyListener {

    public InputDelegate delegate;

    public void keyPressed(KeyEvent arg0) {
        int type = arg0.getKeyCode();
        System.out.println(type);
        switch (type) {
            case KeyEvent.VK_UP:
            delegate.fast();
                break;
            case KeyEvent.VK_DOWN:
            delegate.slow();
                break;

            case KeyEvent.VK_LEFT:
            delegate.moveLeft();
            break;
            case KeyEvent.VK_RIGHT:
            delegate.moveRight();
            default:
                break;
        }
    }

    public void keyReleased(KeyEvent arg0) {

    }

    public void keyTyped(KeyEvent arg0) {

    }
    
}

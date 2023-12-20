package movingbackground.Input;

import java.awt.event.*;

public class Input implements KeyListener {

    public move delegate;

    public void keyPressed(KeyEvent arg0) {
        int type = arg0.getKeyCode();
        switch (type) {
            case KeyEvent.VK_UP:
            delegate.fast();
                break;
            case KeyEvent.VK_DOWN:
            delegate.slow();
                break;
        
            default:
                break;
        }
        //throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
    
}

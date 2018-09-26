import java.awt.event.*;
					
public class KeyboardHandler implements KeyListener {
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyPressed( KeyEvent e ) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("linke Pfeiltaste");
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
}
package autoClicker;

import java.awt.Robot;

public class clicker {
	
	private Robot mouse; 
	private int delay; 
	
	//pub constr
	public clicker() {
		try {
		mouse = new Robot();  
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}//interval btn clicks
		delay = 60000; 
	}
	public void mouseClick(int button) {
		mouse.mousePress(button);
		mouse.delay(0);
		mouse.mouseRelease(button);
		mouse.delay(delay);
	}
	
	public void setDelay(int delay) {
		this.delay = delay;
	}
}

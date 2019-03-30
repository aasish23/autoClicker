package autoClicker;

import java.util.Scanner;
import java.awt.event.InputEvent;
import java.lang.Thread;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("AutoClicker Bot");
		
		System.out.println("Enter the number of clicks");
		int click = sc.nextInt();
		
		System.out.println("Enter delay");
		int delay = sc.nextInt();
		
		System.out.println("starting..");
		
		try {
		Thread.sleep(500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		clicker mouseClick = new clicker();
		mouseClick.setDelay(delay);
		
		for(int i=0; i<click; i++) {
			mouseClick.mouseClick(InputEvent.BUTTON3_MASK);
		}
		
		System.out.println("compeleted");
		
	}
}

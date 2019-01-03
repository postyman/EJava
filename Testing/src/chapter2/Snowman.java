package chapter2;

import java.applet.Applet;
import java.awt.*;

public class Snowman extends Applet {
	public void paint (Graphics page) {
		final int MID = 150;
		final int TOP = 50;
		
		setBackground(Color.CYAN);
		
		page.setColor(Color.blue);
		page.fillRect(0, 175, 300, 50); //ground
		
		page.setColor(Color.YELLOW);
		page.fillOval(-40, -40, 80, 80); //sun
		
		page.setColor(Color.WHITE);
		page.fillOval(MID-20, TOP, 40, 40); //head
		page.fillOval(MID-35, TOP+35, 70, 60); //middle
		page.fillOval(MID-50, TOP+80, 100, 90); //bottom
		
		page.setColor(Color.ORANGE);
		int x[] = {MID+2, MID+15, MID-2};
		int y[] = {TOP+17, TOP+24, TOP+21};
		int numberOfPoints = 3;
		page.fillPolygon(x, y, numberOfPoints); //nose
		
		page.setColor(Color.BLACK);
		page.fillOval(MID-10, TOP+10, 8, 8); //left eye
		page.fillOval(MID+5, TOP+10, 8, 8); //right eye
		
		page.drawArc(MID-10, TOP+20, 20, 10, 190, 160); //smile
		
		page.drawLine(MID-25, TOP+60, MID-50, TOP+40); //left arm
		page.drawLine(MID+25, TOP+60, MID+55, TOP+60); //right arm
		
		page.drawLine(MID-20, TOP+5, MID+20, TOP+5); //brim of hat
		page.fillRect(MID-15, TOP-20, 30, 25); //top of hat
		
		page.fillOval(MID-4, TOP+45, 8, 8); //button
		page.fillOval(MID-4, TOP+60, 8, 8); //button
		page.fillOval(MID-4, TOP+75, 8, 8); //button
		
	}
	
}

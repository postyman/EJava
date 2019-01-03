package chapter2;

import java.applet.Applet;
import java.awt.*;

public class Einstein extends Applet {
	public void paint (Graphics page) {
		page.drawRect(50, 50, 40, 40);
		page.drawRect(60, 80, 225, 30);
		page.drawOval(75, 65, 20, 20);
		page.drawLine(35, 60, 100, 120);
		page.drawArc(100, 100, 100, 50, 90, 180);
		
		int x[] = {5, 40, 5};
		int y[] = {5, 40, 20};
		int numberOfPoints = 3;
		
		page.drawPolygon(x, y, numberOfPoints);
		
		page.drawString("Out of clutter, find simplicity.", 110, 70);
		page.drawString("-- Albert Einstein", 130, 100);
	}
}

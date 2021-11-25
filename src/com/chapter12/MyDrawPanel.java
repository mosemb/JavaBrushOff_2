package com.chapter12;

import javax.swing.JPanel;
import java.awt.*;

public class MyDrawPanel extends JPanel {
	
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
		
	}
	
}

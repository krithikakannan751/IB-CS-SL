// Lab19bst.java
// The student version of the Lab19b assignment.

import java.awt.*;
import java.awt.event.*;


public class Lab19bst
{
	public static void main(String args[])
	{
		Windows win = new Windows();
		win.setSize(1000,750);
		win.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		win.show();
	}
}


class Windows extends Frame
{

    public void paint(Graphics g)
    {
    	drawSquare(g, 0, 100, 200);
    	drawSquare2(g,800,500,200);
    }
    
    public void drawSquare(Graphics g, int x, int y, int size)
    {
		g.fillRect(x,y, size,size);
		x = x+ size+10;
		y += size/4;
		size= size* 3/4;
		if(size > 4)
		drawSquare(g,x,y,size);
    }			
    
    public void drawSquare2(Graphics g, int x, int y, int size)
    {
		g.fillRect(x,y, size,size);
		y = 500;
		size= size* 3/4;
		x = x - size - 10;
		if(size > 4)
		drawSquare2(g,x,y,size);
    }			


}



// Lab10100.java
// This is the 100-point version of the Lab09 assignment.
// It has has multi-level inheritance.
// The <PineTree> class redefines the <drawLeaves> method.
// THe <XmasTree> class adds the <drawOrnament> class.


import java.awt.*;
import java.applet.*;


public class Lab10st extends Applet
{
	public void paint(Graphics g)
	{
		Tree tree = new Tree();
		tree.drawTrunk(g);
		tree.drawLeaves(g);
	
	}
}


class Tree
{
	
	protected int baseCenterX;
	protected int baseCenterY;
	protected int trunkWidth;
	protected int trunkHeight;
	
	protected int leavesWidth;
	protected int leavesHeight;
	
	public Tree()
	{
		
		baseCenterX = 375;
		baseCenterY = 600; 
		trunkWidth = 50;
		trunkHeight = 200;
		
		leavesWidth = 300;
		leavesHeight = 350;
	}
	
	
	public void drawTrunk(Graphics g)
	{
		g.setColor(new Color(128,64,0));
		int tlX = baseCenterX - (trunkWidth/2);
		int tlY = baseCenterY - trunkHeight;
		int brX = baseCenterX + (trunkWidth/2);
		int brY = baseCenterY;
		g.fillRect(tlX,tlY,trunkWidth,trunkHeight);;
	}	
		
	public void drawLeaves(Graphics g)
	{
		g.setColor(Color.green);
		int x1 = baseCenterX - (leavesWidth/2);				 // bottom-left X of leaves 
		int y1 = baseCenterY - trunkHeight;					 // bottom-left Y of leaves
		int x2 = baseCenterX + (leavesWidth/2);				 // bottom-right X of leaves
		int y2 = baseCenterY - trunkHeight;					 // bottom-right Y of leaves
		int x3 = baseCenterX;								 // top X of leaves
		int y3 = baseCenterY - (trunkHeight + leavesHeight); // top Y of leaves
		Polygon triangle = new Polygon();
	 	triangle.addPoint(x1,y1);
	 	triangle.addPoint(x2,y2);
	 	triangle.addPoint(x3,y3);
	 	g.fillPolygon(triangle);
		
	
	}	
				
}




class ShadeTree extends Tree
{
	protected int leavesRadius;
	
		
	public ShadeTree()
	{
		leavesRadius = 150;
	}
	
	public void drawLeaves(Graphics g)
	{
		
		
		
	}	
}





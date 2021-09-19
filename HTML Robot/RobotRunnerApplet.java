import java.applet.Applet;
import java.awt.*;

public class RobotRunnerApplet extends Applet
{
	public void paint(Graphics window)
	{
 	 // background
 	 
 	 Color background = new Color(125,212,255);
 	 window.setColor(background);
 	 window.fillRect(0,0,800,600);
 	 
 	 // ground
 	 
 	 Color ground = new Color(42,217,29);
 	 window.setColor(ground);
 	 window.fillRect(0,460,800,140);
 	 
 	 		//grass
 	 		
 	 		Color grass = new Color(44,132,48);
 	 		window.setColor(grass);
 	 		window.fillRect(50,500,20,20);
 	 		window.fillRect(100,480,60,20);
 	 		window.fillRect(140,520,40,20);
 	 		window.fillRect(260,460,200,20);
 	 		window.fillRect(280,480,160,20);
 	 		window.fillRect(200,560,20,20);
 	 		window.fillRect(320,540,20,20);
 	 		window.fillRect(500,560,20,20);
 	 		window.fillRect(560,540,80,20);
 	 		window.fillRect(600,500,40,20);
 	 		window.fillRect(720,500,40,20);
 	 		
 	 
 	 // clouds
 	
 		// cloud 1
     
     	window.setColor(Color.white);
     	window.fillRect(20,360,40,80);
     	window.fillRect(40,380,20,40);
     
     	window.setColor(Color.gray);
     	window.fillRect(40,360,40,20);
     	window.fillRect(60,380,40,40);
     	window.fillRect(40,420,40,20);
     
     	// cloud 2
    	
    	window.setColor(Color.white);
    	window.fillRect(120,80,100,40);
     	window.fillRect(140,60,60,80);
     
	    window.setColor(Color.gray);
	    window.fillRect(200,60,40,20);
	    window.fillRect(220,80,40,40);
	    window.fillRect(200,120,40,20);
     	
     	// cloud 3
	   
	    window.setColor(Color.white);
	    window.fillRect(500,0,100,40);
	    window.fillRect(520,40,60,20);
     
        window.setColor(Color.gray);
        window.fillRect(600,0,40,40);
        window.fillRect(580,40,40,20);
     
     	// cloud 4
    
	    window.setColor(Color.white);
	    window.fillRect(640,360,100,40);
	    window.fillRect(660,340,60,80);
	     
	    window.setColor(Color.gray);
	    window.fillRect(720,340,40,20);
	    window.fillRect(740,360,40,40);
	    window.fillRect(720,400,40,20);
 	 
 	 // mario
 	 	
 	 	// cap
 	 
	 	 window.setColor(Color.red);
	     window.fillRect(340,180,140,60);
	     window.fillRect(300,220,40,20);
	     
	     Color cap = new Color(200,0,0);
	 	 window.setColor(cap);
	     window.fillRect(440,180,40,60);
	     window.fillRect(400,220,40,20);
 	 	
 	 	// face
	 	 
	 	 Color face = new Color(253,199,145);
	 	 window.setColor(face);
	     window.fillRect(340,240,140,100);
	     
	     Color faceshadow = new Color(252,180,108);
	 	 window.setColor(faceshadow);
	     window.fillRect(460,260,20,40);
	     window.fillRect(440,280,40,20);
	     window.fillRect(440,280,20,60);
	     window.fillRect(440,320,40,20);
   		
   		// eyes
	    
	     window.setColor(Color.black);
	     window.fillRect(360,240,20,40);
	     window.fillRect(400,240,20,40);
    	
    	// nose
	     
	     Color nose = new Color(244,165,116);
	 	 window.setColor(nose);
	     window.fillRect(320,280,60,40);
	    
	     Color noseshadow = new Color(242,144,84);
	 	 window.setColor(noseshadow);
	     window.fillRect(380,280,20,40);
 	 	
 	 	// hair
	     
	     Color hair = new Color(80,59,16);
	 	 window.setColor(hair);
	     window.fillRect(440,240,20,40);
	     window.fillRect(440,240,60,20);
	     window.fillRect(480,240,20,80);
	     window.fillRect(460,300,40,20);
 	 	
 	 	//stach
	 	 
	 	 Color stach = new Color(135,99,27);
	 	 window.setColor(stach);
	     window.fillRect(300,300,20,20);
	     window.fillRect(320,320,100,20);
	     window.fillRect(400,300,40,20);
 	 	
 	 	// shirt
	 	 
	 	 window.setColor(Color.red);
	     window.fillRect(320,360,20,20);
	     window.fillRect(360,340,60,20);
	     
	 	 window.setColor(cap);
	     window.fillRect(440,340,40,20);
	     window.fillRect(460,360,40,20);
     	
     	// hands
	     
	     window.setColor(faceshadow);
	     window.fillRect(320,380,20,20);
	     window.fillRect(460,380,40,20);
     	
     	// overall
	     
	     Color overall = new Color(55,144,225);
	     window.setColor(overall);
	     window.fillRect(340,340,20,100);
	     window.fillRect(420,340,20,100);
	     window.fillRect(340,360,100,40);
	     
	     window.setColor(Color.yellow);
	     window.fillRect(340,360,20,20);
	 	 window.fillRect(420,360,20,20);
	     
	     window.setColor(Color.blue);
	     window.fillRect(360,400,60,20);
	 	 window.fillRect(360,420,40,20);
	 	 window.fillRect(440,360,20,80);
	 	 window.fillRect(460,400,20,40);
 	 
 	 	// shoes
	 	
	 	 Color shoes = new Color(92,69,50);
	     window.setColor(shoes);
	 	 window.fillRect(320,440,80,20);
	 	 window.fillRect(400,440,80,20);
	 	 
	 	 Color shoetip = new Color(141,106,77);
	     window.setColor(shoetip);
	 	 window.fillRect(320,440,20,20);
	 	 window.fillRect(400,440,20,20);
     
 	 // block
 	 
 	 window.setColor(stach);
 	 window.fillRect(650,120,140,140);
 	 
 	 window.setColor(Color.black);
 	 window.fillRect(670,140,20,100);
 	 window.fillRect(750,140,20,100);
 	 window.fillRect(670,140,100,20);
 	 window.fillRect(710,140,20,60);
 	 
 	 window.fillRect(650,120,20,20);
 	 window.fillRect(650,240,20,20);
     window.fillRect(770,120,20,20);
 	 window.fillRect(770,240,20,20);
 	
 	 // text

     window.setColor(Color.black);
     window.drawString("Robot LAB",35,200);
	 window.drawString("KRITHIKA KANNAN", 35,250);
	  
	}
	

}
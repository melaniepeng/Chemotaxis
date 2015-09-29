import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] friends; 
Bacteria [] more;
int x = 200;
int y = 200;
 public void setup()   
 {    
 	size(400,400);   
 	friends = new Bacteria [10];
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i] = new Bacteria();
 	}
 }   
 public void draw()   
 {
 	background(255);
 	fill(0,0,225);
 	ellipse(mouseX,mouseY,15,15);
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i].show();
 		friends[i].move();
 		
 	}
 	if (get(friends[friends.length].myX,friends[friends.length].myY) == color (0,0,255))
 	{
 		more = new Bacteria [100];
 		for (int j = 0; j < more.length; j++ )
 		{
 			more[j] = new Bacteria();
 		}
 	}
 	

 }  

 class Bacteria    
 { 
 	int myX, myY,col1,col2,col3;    
 	Bacteria()
 	{
 		myX = x;
 		myY = y;
 		col1 = (int)(Math.random()*255);
 		col2 = (int)(Math.random()*255);
 		col3 = (int)(Math.random()*255);
 	}  
 	//int out = false;
 	public void move()
 	{
 		int steps = (int)(Math.random()*3)-1;
 		int dir = (int)(Math.random()*4);
 		int bias = (int)(Math.random()*3)-2;
 		if (dir == 0)
 		{
 			myX = myX + steps;
 		}
 		else if (dir == 1)
 		{
 			myX = myX - steps;
 		} 
 		else if (dir == 2)
 		{
 			myY = myY + steps;
 		}
 		else 
 		{
 			myY = myY - steps;
 		}

 		if (mouseX > myX)
 		{
 			myX = myX - bias;
 		}
 		else
 		{
 			myX = myX + bias;
 		}

 		if (mouseY > myY)
 		{
 			myY = myY - bias;
 		}
 		else
 		{
 			myY = myY + bias;
 		}
 	} 
 	public void show()
 	{
 		//myX = (int)(Math.random()*400);
 		//myY = (int)(Math.random()*400);
 		noStroke();
 		fill(col1,col2,col3,90);
 		ellipse(myX, myY, 10, 10);
 		
 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

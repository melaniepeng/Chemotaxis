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
boolean alive = true;
 public void setup()   
 {    
 	size(400,400);   
 	friends = new Bacteria [100];
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i] = new Bacteria();
 	}
 	more = new Bacteria [10];
 			for (int j = 0; j < more.length; j++ )
 			{
 				more[j] = new Bacteria();
 			}

 }   
 public void draw()   
 {
 	background(255);
 	fill(0,0,225);
 	ellipse(mouseX,mouseY,15,15);
 	more = new Bacteria [10];
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i].show();
 		friends[i].move();
 		friends[i].eat();
 		

 	}
 	if(alive == false)
 	{
 		for (int j = 0; j < more.length; j++ )
 		{
 		 	more[j].eat();
 		}
 	}
 	
 }  

 class Bacteria    
 { 
 	int myX, myY,col1,col2,col3;    
 	boolean alive = true;
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

 		
 	} 
 	public void eat ()
 	{
 		int bias = (int)(Math.random()*3)-2;
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
 		if (get(myX,myY) == color (0,0,255))
 		{
 			alive = false;
 		}
 	}
 	public void show()
 	{
 		if (alive == true)
 		{
 			noStroke();
 			fill(col1,col2,col3,90);
 			ellipse(myX, myY, 10, 10);
 		}
 		
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

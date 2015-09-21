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
//int x =  200; 
//int y =  200;
 public void setup()   
 {    
 	size(400,400);   
 	friends = new Bacteria [100];
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i] = new Bacteria(200,200);
 	}
 }   
 public void draw()   
 {
 	frameRate(5);
 	background(255);
 	//int x =  200; //(int)(Math.random()*21)-10;
 	//int y =  200; //(int)(Math.random()*21)-10;
 	//System.out.println(dir);
 	//Bacteria one = new Bacteria (x,y);
 	//one.show();
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i].move();
 		friends[i].show();
 	}
 }  
 class Bacteria    
 { 
 	int myX, myY,col1,col2,col3;    
 	Bacteria(int x, int y)
 	{
 		myX = x;
 		myY = y;
 		col1 = (int)(Math.random()*255);
 		col2 = (int)(Math.random()*255);
 		col3 = (int)(Math.random()*255);
 	}  
 	public void move()
 	{
 		int steps = (int)(Math.random()*11)-5;
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
 	public void show()
 	{
 		noStroke();
 		fill(col1,col2,col3,90);
 		//System.out.println(col);
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

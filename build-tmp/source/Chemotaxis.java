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

 //declare bacteria variables here   
 public void setup()   
 {    
 	size(400,400);   
 	
 }   
 public void draw()   
 {
 	frameRate(10);
 	background(0);
 	int x =  (int)(Math.random()*21)-10;
 	Bacteria one = new Bacteria (200 + x,200);
 	one.show();
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

 	} 
 	public void show()
 	{
 		noStroke();
 		fill(col1,col2,col3,127);
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

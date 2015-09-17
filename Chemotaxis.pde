 //declare bacteria variables here   
 void setup()   
 {    
 	size(400,400);   
 	
 }   
 void draw()   
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
 	void move()
 	{

 	} 
 	void show()
 	{
 		noStroke();
 		fill(col1,col2,col3,127);
 		//System.out.println(col);
 		ellipse(myX, myY, 10, 10);
 		
 	}
 }    
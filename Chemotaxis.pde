 //declare bacteria variables here   
 void setup()   
 {     
 	size(400,400);   
 }   
 void draw()   
 {    
 	//move and show the bacteria   
 }  
 class Bacteria    
 { 
 	int myX, myY,col;    
 	Bacteria(int x, int y)
 	{
 		myX = x;
 		myY = y;
 		col = (int)(Math.random()*255);
 	}  
 	void move()
 	{

 	} 
 	void show()
 	{
 		fill(col,col,col)
 		ellipse(myX, myY, 5, 5);
 		
 	}
 }    
Bacteria [] friends; 
//int x =  200; 
//int y =  200;
 void setup()   
 {    
 	size(400,400);   
 	friends = new Bacteria [100];
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i] = new Bacteria(200,200);
 	}
 }   
 void draw()   
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
 	void move()
 	{
 		int dir = (int)(Math.random()*4);
 		if (dir == 0)
 		{
 			myX = myX + 10;
 		}
 		else if (dir == 1)
 		{
 			myX = myX - 10;
 		} 
 		else if (dir == 2)
 		{
 			myY = myY + 10;
 		}
 		else 
 		{
 			myY = myY - 10;
 		}
 	} 
 	void show()
 	{
 		noStroke();
 		fill(col1,col2,col3,80);
 		//System.out.println(col);
 		ellipse(myX, myY, 10, 10);
 		
 	}
 }    
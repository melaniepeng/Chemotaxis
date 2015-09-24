Bacteria [] friends; 
Bacteria [] more;
int x = 200;
int y = 200;
int i = 0;
//int z = 100;
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
 	background(255);
 	fill(0,0,225);
 	ellipse(mouseX,mouseY,15,15);
 	for (int i = 0; i < friends.length; i++ )
 	{
 		friends[i].move();
 		friends[i].show();
 	}
 	if (get(friends[i].myX,friends[i].myY) == color (0,0,225))
 	{
 		more = new Bacteria [10];
		for (int s = 0; s < more.length; s++ )
 		{
 			more[s] = new Bacteria(200,200);
			more[s].move();
 			more[s].show();
 		}
 	}
 	/*if (mousePressed)
 	{
 		ellipse(mouseX,mouseY,15,15);
 		for (int i = 0; i < friends.length; i++ )
 		{
 			friends[i].myX = mouseX;
 			friends[i].myY = mouseY;
 		}
 	}*/
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
 	//int out = false;
 	void move()
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
 		/*if (myX > 400 || myY > 400)
 		{
 			out = true;
 		}
 		else
 		{
 			out = false;
 		}*/
 	} 
 	void show()
 	{
 		noStroke();
 		fill(col1,col2,col3,90);
 		ellipse(myX, myY, 10, 10);
 		
 	}
 }    
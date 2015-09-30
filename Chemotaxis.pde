Bacteria [] friends; 
Bacteria [] more;
int x = 200;
int y = 200;
boolean alive = true;
 void setup()   
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
 void draw()   
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
 		if (get(friends[i].myX,friends[i].myY) == color (0,0,255))
 		{
 			
 			for (int j = 0; j < more.length; j++ )
 			{
 				more[j] = new Bacteria();
 				more[j].show();
 				more[j].move();
 			}
 			alive = false;

 		}

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
 	Bacteria()
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
 	void eat ()
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
 	}
 	void show()
 	{
 		//myX = (int)(Math.random()*400);
 		//myY = (int)(Math.random()*400);
 		noStroke();
 		fill(col1,col2,col3,90);
 		ellipse(myX, myY, 10, 10);
 		
 	}
 }    

public class RectTest extends MyFrame{
  public void run() {
	  setColor(250,250,0);
	  fillRect(30,40,50,100);
	  
	  setColor(250,0,250);
	  fillRect(130,40,50,100);
	  
	  setColor(100,180,250);
	  fillRect(30,200,150,10);
	  
	  setColor(0,0,0);
	  fillRect(90,160,30,30);
	  
	  setColor(100,100,100);
	  fillRect(90,100,30,30);
	  
	  for(int i = 1; i>10;i++) 
	  {
		 
		  fillRect(10*i,10*i,90,90);
		 
	  }
  }
	
}

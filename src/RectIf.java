
public class RectIf extends MyFrame{
 public void run() {
	 int x = 30;
 
	 int i;
	
	 
	 //EX
	 for(i=0 ; i<17; i++)
	 {
		 if(i<8) {
			 
			 setColor(0,0+x,0);	 
			
		 }
		 else {
			 
			 setColor(0,370-x,0);
			
		 }
		 
			 fillRect(x,80,10,x);
		 
			 x+=20;
	 }
	 
	 
//4-3
//	int rbg = 0;
//	for(int i = 0; i<10; i++)
//	{
//		rbg+=20;
//		setColor(rbg,rbg,rbg);
//		fillRect(x,100,10,100);
//		x+=15;
//	}
	 
	 
	 
	 
	 
//	 4-2
//	 for(i=0 ; i<9; i++)
//	 {
//		 
//			 fillRect(x,80,10,x);
//		
//		 x+=20;
//	 }
	 
	 
//	 4-1
//	 for(i=0 ; i<9; i++)
//	 {
//		 
//			 fillRect(x,x,10,100);
//		
//		 x+=20;
//	 }
	 
	 
	 
//	 for(i=0 ; i<9; i++)
//	 {
//		 if(i==4)
//		 {
//			 fillRect(x,100,10,100);
//		 }
//		 else {
//			 fillRect(x,80,10,100);
//		 }
//		 x+=20;
//	 }
 }
}

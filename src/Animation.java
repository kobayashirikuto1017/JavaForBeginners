
public class Animation extends MyFrame{
public void run() {
	int y=100;
	int x=50;
	
//	練習問題　５-１
//	while(y>=80) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,100,100);
//		y-=5;	
//		sleep(0.1);
//	}
//	
//	while(x<=170) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,100,100);
//		x+=5;	
//		sleep(0.1);
//	}
//	
//
//	練習問題　5-2
//	while(x<=200) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x+=5;
//		y+=5;	
//		sleep(0.1);
//	}
//	
//	while(x>=50) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x-=5;	
//		sleep(0.1);
//	}
//	
//	while(x<=200) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x+=5;
//		y-=5;	
//		sleep(0.1);
//	}

//	練習問題　5-3
//	for(int z=0; z<3; z++)
//	{
//	while(x<200) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x+=5;	
//		sleep(0.1);
//	}
//	while(x>=50) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x-=5;	
//		sleep(0.1);
//	}
//	}
	
//	5-EX 
//	while(true) {
//	while(x<200) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x+=5;	
//		sleep(0.1);
//	}
//	
//	while(y<=200) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		y+=5;	
//		sleep(0.1);
//	}
//
//	while(x>=50) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x-=5;	
//		sleep(0.1);
//	}
//	while(y>=50) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,10);
//			y-=5;	
//			sleep(0.1);
//		}
//	}

//	5-EX2
//	while(true) {
//		y=100;
//		x=50;
//	while(x<200) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x+=5;	
//		sleep(0.1);
//	}
//	
//	while(y<=200) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		y+=5;	
//		sleep(0.1);
//	}
//
//	while(x>=50) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		x-=5;	
//		sleep(0.1);
//	}
//	while(y<=300) {
//		clear();
//		setColor(0,128,0);
//		fillRect(x,y,10,10);
//		y+=5;	
//		sleep(0.1);
//	}
//	}
	
//	おまけ
	y= 100;
	x=100;
	
	int ycount = 0;
	int xcount = 0;
	while(true) {
		
		while(x<=200  || x<=100)    {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,10);
			
			if(xcount % 2 == 0 && x<200)
			{
			x+=5;	
			}
			
			 if(xcount % 2 == 1 && x>=100)
			{
			x-=5;
			}
			sleep(0.1);
			if(x==200) {
				break;
			}
			if(x==100) {
				break;
			}
		}
		xcount= xcount +1;
		
		while(y<=200+ycount ) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,10);
			
			y+=5;	
			
			sleep(0.1);
	}
		ycount = ycount+100;
		
		
	}
	
}


}


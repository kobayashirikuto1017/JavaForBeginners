import java.util.Vector;

public class DisplayCarVector  extends MyFrame{
	public void run() {
		
//		練習問題7-1
//		Vector<Car> cars=new Vector<Car>();
//		cars.add(new Car(50,50,1,5));
//		cars.add(new Car(50,120,2,5));
//		cars.add(new Car(50,190,3,5));
//		cars.add(new Car(50,260,4,5));
//		cars.add(new Car(50,330,5,5));
//		for(int i=0; i<50; i++) {
//			clear();
//			for(int j=0; j<cars.size(); j++) {
//				cars.get(j).draw(this);
//				cars.get(j).move();
//			}
//			
//			
//			sleep(0.01);
//		}

//		7-EX
//		Vector<Car> cars=new Vector<Car>();
//		
//		while(true) {
//			cars.add(new Car(50,50,1,5));
//			cars.add(new Car(50,120,2,5));
//			cars.add(new Car(50,190,3,5));
//			cars.add(new Car(50,260,4,5));
//			cars.add(new Car(50,330,5,5));
//		
//		for(int i=0; i<50; i++) {
//			clear();
//			for(int j=0; j<cars.size(); j++) {
//				cars.get(j).draw(this);
//				cars.get(j).move();
//			}
//			
//			
//			sleep(0.01);
//		    }
//		   cars.clear();
//	     }
	
//		7-EX2
         Vector<Car> cars=new Vector<Car>();
		int speed = 0;
		while(true) {
			cars.add(new Car(50,50,1+speed,5));
			cars.add(new Car(50,120,2+speed,5));
			cars.add(new Car(50,190,3+speed,5));
			cars.add(new Car(50,260,4+speed,5));
			cars.add(new Car(50,330,5+speed,5));
		
		for(int i=0; i<50; i++) {
			clear();
			for(int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			
			
			sleep(0.01);
		    }
		   cars.clear();
		   
		   speed++;
	     }
		
		
	}

}




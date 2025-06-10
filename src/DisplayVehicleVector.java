import java.util.Vector;

public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle>vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(10,30,10,0));
		vehicles.add(new Car(60,90,-5,0));
		vehicles.add(new Train(90,150,7,0));
		vehicles.add(new Train(80,200,-9,0));
		vehicles.add(new Truck(30,250,11,0));
		vehicles.add(new Truck(200,310,13,0));
		
		for(int i=0; i<100; i++) {
			clear();
			for(int j=0; j<vehicles.size();j++) {
				vehicles.get(j).draw(this);
				
				
				vehicles.get(j).move(this);
				
		   }
			sleep(0.01);
       }
	  	
   }
	
}
	



public class Car {
	int x,y,vx,vy;
	public Car(int x, int y, int vx, int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
 public void draw(MyFrame frame) {
	 frame.fillOval(x,y,20,20);
	 frame.fillOval(x-30,y,20,20);
	 frame.fillRect(x-20, y-30, 30, 20);
	 frame.fillRect(x-40, y-10, 70, 20);
 }
 public void move() {
	 x+=vx;
	 
 }

}

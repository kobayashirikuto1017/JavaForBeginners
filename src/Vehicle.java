
public class Vehicle {
	int x,y,vx,vy;
	public Vehicle(int x, int y, int vx, int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	 public void move(MyFrame f) {
		 x+=vx;
		 y+=vy;
		 
//		 8-EX
//		 if(x<=-80) {
//				x=400;
//			}
//		 else	if(x>=400) {
//				x=-80;
//			}
		 
//		 8-EX
		 int width = f.getWidth();
		 
		 if(x<-80) {
				x=width +100;
			}
		 else	if(x>width) {
				x=-80 +100;
			}
		 
	 }
	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}

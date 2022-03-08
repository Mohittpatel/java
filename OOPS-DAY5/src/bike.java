
public class bike {
	int speed;
	String Model;
	public void setSpeed(int s) {
		this.speed=s;
		
	}
	public int getSpeed() {
		return speed;
	
	
	}
	void display() {
		System.out.println("welecome to YAMAHA");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike obj=new bike();
		obj.display();
		obj.setSpeed(21);
		System.out.println( obj.getSpeed() );
	}

}

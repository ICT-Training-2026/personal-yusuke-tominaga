package ensyu;

public class Nomal extends ensyu01 implements Deliver{
	public Nomal(String x,int y){
		super(x,y);
	}
	
	@Override
	public void display() {
		System.out.println(super.getNameAndPrice());
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【通常配送料500円】" + super.getNameAndPrice());
	}
}

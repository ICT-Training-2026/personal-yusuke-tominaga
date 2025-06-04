package ensyu;

public class Special extends ensyu01 implements Deliver{
	private int orgPrice;
	
	public Special(String name,int price, int orgPrice) {
		super(name,price);
		this.orgPrice = orgPrice;
	}
	
	@Override
	public void display() {
		System.out.println(super.getNameAndPrice() + "(定価："+orgPrice+"円)");
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【＊特別配送料300＊】"+super.getNameAndPrice());
	}
}

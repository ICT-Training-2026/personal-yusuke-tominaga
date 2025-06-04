package ensyu;

public abstract class ensyu01 {
	private String name;
	private int price;
	
	protected ensyu01(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract void display();
	
	protected String getNameAndPrice() {
		return name+":"+price;
	}
}

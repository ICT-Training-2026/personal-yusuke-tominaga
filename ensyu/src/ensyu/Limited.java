package ensyu;

public class Limited extends ensyu01{
	int daycnt;
	public Limited(String name,int price,int daycnt){
		super(name,price);
		this.daycnt = daycnt;
	}
	
	@Override
	public void display() {
		System.out.println(super.getNameAndPrice()+"(配送不可)(残り："+daycnt+"日)");
		
	}

}

package ensyu;

public class sample04 extends Sample03 {
	private int orgPrice;
	
	public sample04(String name,int price,int orgPrice){
		super(name,price);
		this.orgPrice = orgPrice;
	}
	
	public sample04(String name){
		super(name);
	}
	
	public int getOrgPrice() {
		return orgPrice;
	}
	
	public void setOrgPrice(int orgPrice) {
		this.orgPrice = orgPrice;
	}
	
	public void displayOrgPrice() {
		System.out.println("定価："+orgPrice);
	}
	
	@Override 
	public void display() {
		System.out.println(getName() + "：" + getPrice() + "(" + "定価；" + orgPrice +")");
	}
}

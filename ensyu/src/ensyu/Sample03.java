package ensyu;
public class Sample03 {
	
	static private String COMPANY_NAME = "速水PC販売店";
	static private int DEFAULT_SALES_AMT = 150000;
	static private int DEFAULT_CHANGE_AMT = 1000;
	private String name;
	int saleseAmt;
	private int price;
	
	public Sample03(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public Sample03(String name){
		this(name,0);
	}
	
	public static void displayStoreName() {
		System.out.println("会社名 : " + COMPANY_NAME);
	}
	
	public int up(int amt) {
		return price += amt;
	}
	
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT) ;
	}
	
	public int down(int amt) {
		return price -= amt;
	}
	
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	 
	int sell(int amt){
		return saleseAmt += amt;
	}
	
	int sell() {
		return this.sell(DEFAULT_SALES_AMT);
	}
	
	int refund(int amt) {
		return saleseAmt -= amt;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println(name + ":" + price + "円");
	}
	

}



public class Assignment3 {
	public static void main(String[] args) {
		Person a = new Person("Jim", "15-10 Jewel Ave", "718-848-4838");
		Person b = new Customer("Jim", "15-10 Jewel Ave", "718-848-4838", "71", true);
		Person c = new PreferredCustomer("Jim", "15-10 Jewel Ave", "718-848-4838", "71", true, 1590.02);
		System.out.println(a + "\n\n" + b + "\n\n" + c + "\n");
	}
}

class Person {
	private String name;
	private String address;
	private String telephone;

	public Person() {
		name = null;
		address = null;
		telephone = null;
	}

	public Person(String name, String address, String telephone) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String getAddress() {
		return address;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	String getTelephone() {
		return telephone;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Address: " + address + "\n" + "Telephone number: " + telephone;
	}
}

class Customer extends Person {
	private String number;
	private boolean mailing;

	public Customer() {
		number = null;
		mailing = true;
	}

	public Customer(String name, String address, String telephone, String number, boolean mailing) {
		super(name, address, telephone);
		this.number = number;
		this.mailing = mailing;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	String getNumber() {
		return number;
	}

	public void setMailing(boolean mailing) {
		this.mailing = mailing;
	}

	boolean getMailing() {
		return mailing;
	}

	public String toString() {
		return "Name: " + getName() + "\n" + "Address: " + getAddress() + "\n" + "Telephone number: " + getTelephone()
				+ "\n" + "Customer's number: #" + number + "\n" + "Mailing list: " + mailing;
	}
}

class PreferredCustomer extends Customer {
	private double sales;
	private int discount;

	public PreferredCustomer() {
		sales = 0;
		discount = 0;
	}

	public PreferredCustomer(String name, String address, String telephone, String number, boolean mailing,
			double sales) {
		super(name, address, telephone, number, mailing);
		this.sales = sales;
		this.discount = discount;
		if (sales < 1000.00 && sales >= 500.00)
			discount = 5;
		if (sales < 1500.00 && sales >= 1000.00)
			discount = 6;
		if (sales < 2000.00 && sales >= 1500.00)
			discount = 7;
		if (sales >= 2000.00)
			discount = 10;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	double getSales() {
		return sales;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	int getDiscount() {
		return discount;
	}

	public String toString() {
		return "Name: " + getName() + "\n" + "Address: " + getAddress() + "\n" + "Telephone number: " + getTelephone()
				+ "\n" + "Customer's number: #" + getNumber() + "\n" + "Mailing list: " + getMailing() + "\n"
				+ "Sales Total: $" + sales + "\n" + "Discount percentage: " + discount + "%";

	}
}

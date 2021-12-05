package ItemType1;

public class ItemType {
	private String name;

	private Double costPerDay;

	private Double deposit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public void display() {

		System.out.println("** Item type details **");
		System.out.println("Name : " + getName());
		System.out.println("CostPerDay : " + getCostPerDay());
		System.out.println("Deposit : " + getDeposit());

	}

}

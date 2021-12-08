package inheritance1.cs5;

public class Exhibition extends Event {

	protected int noOfStalls;

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	public Exhibition(String name, String detail, String ownerName, int noOfStalls) {
		super(name, detail, ownerName);
		this.noOfStalls = noOfStalls;
	}

	@Override
	public double projectedRevenue() {
		double revenue;
		revenue = 10000 * noOfStalls;
		return revenue;
	}
}

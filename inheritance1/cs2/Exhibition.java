package inheritance1.cs2;

public class Exhibition extends Event {
	int noOfStall;

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

	public Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStall) {
		super(name, detail, type, ownerName, costPerDay);
		this.noOfStall = noOfStall;
	}

}

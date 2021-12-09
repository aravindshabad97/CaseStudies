package abstractClassesAndInterfaces.cs3;

public class Exhibition extends Event {

	private int noOfStalls;
	private double rentPerStall;

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	public double getRentPerStall() {
		return rentPerStall;
	}

	public void setRentPerStall(int rentPerStall) {
		this.rentPerStall = rentPerStall;
	}

	@Override
	public Double calculateAmount() {
		return noOfStalls * rentPerStall;
	}

	public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall) {
		super(name, detail, type, organiser);
		this.noOfStalls = noOfStalls;
		this.rentPerStall = rentPerStall;
	}

}

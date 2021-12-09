package abstractClassesAndInterfaces.cs3;

public class StageEvent extends Event {

	private int noOfShows;
	private double costPerShow;

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public double getRentPerStall() {
		return costPerShow;
	}

	public void setRentPerStall(double costPerShow) {
		this.costPerShow = costPerShow;
	}

	public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow) {
		super(name, detail, type, organiser);
		this.noOfShows = noOfShows;
		this.costPerShow = noOfShows;
	}

	@Override
	public Double calculateAmount() {
		return noOfShows * costPerShow;
	}

}

package inheritance1.cs5;

public class StageEvent extends Event {

	protected int noOfShows, noOfSeatsPerShow;

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public StageEvent(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	@Override
	public double projectedRevenue() {
		double revenue = noOfShows * noOfSeatsPerShow * 50;
		return revenue;
	}
}

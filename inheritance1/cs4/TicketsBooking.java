package inheritance1.cs4;

public class TicketsBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;

	public String getStageEvent() {
		return stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public TicketsBooking() {

	}

	public TicketsBooking(String stageEvent, String customer, int noOfSeats) {
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}

	public void makepayment(double amount) {

		System.out.println("Stage Event : " + stageEvent + "\n Customer:" + customer + "\n Number of seats:" + noOfSeats
				+ "\n Amount : " + amount + " paid in cash");
	}

	public void makePayment(String walletNumber, Double amount) {

		System.out.println("Stage Event : " + stageEvent + "\nCustomer:" + customer + "\nNumber of seats:" + noOfSeats
				+ "\nAmount : " + amount + " paid using wallet number : " + walletNumber);
	}

	public void makePayment(String creditCard, String ccv, String name, double amount) {
		System.out.println("Stage Event : " + stageEvent + "\nCustomer:" + customer + "\nNumber of seats:" + noOfSeats
				+ "\nHolder name : " + name + "\nAmount : " + amount + " paid using : " + creditCard + "\nCCV:" + ccv);
	}
}

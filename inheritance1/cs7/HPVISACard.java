package inheritance.cs7;

public class HPVISACard extends VISACard {

	public Double computeRewardPoints(String purchaseType, Double amount) {

		if (purchaseType.equalsIgnoreCase("fuel")) {
			return (amount * 0.01) + 10;
		} else {
			return amount * (0.1);
		}

	}

}

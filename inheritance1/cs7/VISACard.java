package inheritance1.cs7;

public class VISACard {

	private String holderName;
	private String ccv;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCcv() {
		return ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	
	public Double computeRewardPoints(String purchaseType, Double amount) {
		
		return amount * (0.01);
		
	}

}

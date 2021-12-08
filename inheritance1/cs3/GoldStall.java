package inheritance1.cs3;

public class GoldStall extends SilverStall {

	private int tvSet;

	public int getTvSet() {
		return tvSet;
	}

	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}

	public GoldStall(String name, String detail, String owner, int cost, int tvSet) {
		super(name, detail, owner, cost);
		this.tvSet = tvSet;
	}
}

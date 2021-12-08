package inheritance1.cs3;

public class PlatinumStall extends GoldStall {

	private int projector;

	public int getProjector() {
		return projector;
	}

	public void setProjector(int projector) {
		this.projector = projector;
	}

	public PlatinumStall(String name, String detail, String owner, int cost, int tvSet, int projector) {
		super(name, detail, owner, cost, tvSet);
		this.projector = projector;
	}

	public PlatinumStall(String name, String detail, String owner, int cost, int tvSet) {
		super(name, detail, owner, cost, tvSet);

	}
}

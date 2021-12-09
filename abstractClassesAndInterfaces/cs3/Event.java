package abstractClassesAndInterfaces.cs3;

public abstract class Event {

	protected String name;
	protected String detail;
	protected String type;
	protected String organiser;

	public Event(String name, String detail, String type, String organiser) {
		
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
	}

	public abstract Double calculateAmount();
}

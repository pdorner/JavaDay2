package testhan;

public class WeinObject {
	
	private String name;

	public WeinObject(String name) {
		super();
		this.name = name;
	}
	
	public WeinObject() { //parameterloser Konstrukter
		name = "Vinothek";
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}

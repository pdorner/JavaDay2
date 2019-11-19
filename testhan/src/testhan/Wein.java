package testhan;

public class Wein extends WeinObject{
	
	private String weingut;
	private int jahr;
	private double preis;
	public Wein(String name, String weingut, int jahr, double preis) {
		super(name);
		this.weingut = weingut;
		this.jahr = jahr;
		this.preis = preis;
	}
	public String getWeingut() {
		return weingut;
	}
	public int getJahr() {
		return jahr;
	}
	public double getPreis() {
		return preis;
	}
	@Override
	public String toString() {
		return getName() + " (" + weingut + ")";
	}
	

}

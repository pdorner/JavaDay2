package firstDay;


public class Calculator {
	private double a;
	private double b;
	public Calculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	};
	
	public double add() {
	 double c = this.a + this.b;
	 return c;
		
	}
	public double sub() {
		 double c = this.a - this.b;
		 return c;
			
		}
	public double div() {
		 double c = this.a / this.b;
		 return c;
			
		}
	public double mult() {
		 double c = this.a * this.b;
		 return c;
			
		}

}

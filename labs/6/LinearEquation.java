public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	/** Returns the a value */
	public double getA(){
		return a;
	}
	
	/** Returns the b value */
	public double getB(){
		return b;
	}
	
	/** Returns the c value */
	public double getC(){
		return c;
	}
	
	/** Returns the d value */
	public double getD(){
		return d;
	}
	
	/** Returns the e value */
	public double getE(){
		return e;
	}
	
	/** Returns the f value */
	public double getF(){
		return f;
	}
	
	/** Returns true if ad-bc is not zero. Checks if problem is solvable */
	public boolean isSolvable(){
		if((a * d) - (b * c) != 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	/** Returns the solution for x */
	public double getX(){
		double top = (e * d) - (b * f);
		double bottom = (a * d) - (b * c);
		return top / bottom;
	}
	
	/** Returns the solution for y */
	public double getY(){
		double top = (a * f) - (e * c);
		double bottom = (a * d) - (b * c);
		return top / bottom;
	}
}

package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction add (Fraction F2) {
		int newNumerator;
		int newDenominator;
		newDenominator = this.denominator * F2.denominator;
		newNumerator = (this.numerator * F2.denominator) + (F2.numerator * this.denominator);
		return new Fraction(newNumerator, newDenominator) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction newFraction = add(F1, F2); 
		System.out.println(NewFraction.numerator + "/" + newFraction.denomennator)
	}

}

package studio7;

public class Die {
// setting nSides == nothing; if you have a default value, you can hard code a number
	private int nSides; 
	
	private String color; 
		
		
	public Die(int nSides, String color) {
		// n sides
		this.nSides=nSides; 
		// color will always be blue 
		this.color=color; 
	}
	
	public int randomRoll() {
		return (int)(Math.random()*nSides)+1; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1=new Die(18, "BLUE");
		Die d2=new Die(20, "YELLOW");
		System.out.println(d1.randomRoll() + " " + d1.color); 
		System.out.println(d2.randomRoll() + " " + d2.color);
	}

}

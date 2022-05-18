package application;

public class Salad implements java.io.Serializable{
	private double calories;
	private double servings;
	private int portion;
	
	
	
	public Salad(int portion) {
		this.calories = 250;
		this.portion = portion;
		if(this.portion == 1)
		{
			this.servings = 2;
		}
		else if(this.portion == -1)
		{
			this.servings = 0;
			this.portion = 0;
		}
		else
		{
			this.servings = 4;
		}
	}
	public double getCalories() {
		return calories;
	}

	public double getServings() {
		return servings;
	}
	
	public double getPortion() {
		return portion;
	}
	
	public double totalCalories()
	{
		return this.calories*this.servings;
		
	}
	public String ToString()
	{
		return String.format("The Salad with %d portion(s) will result in a %.2f servings and %.2f total calories",this.portion, this.servings, this.totalCalories());
	}
	

}

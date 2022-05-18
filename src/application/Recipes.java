package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Scene;

public class Recipes implements java.io.Serializable {
	private Cake cake;
	private Chicken chicken;
	private Salad salad;
	private Salmon salmon;
	private Smoothie smoothie;
	private List<Cake> cakeList = new ArrayList<Cake>();
	private List<Chicken> chickenList = new ArrayList<Chicken>();
	private List<Salad> saladList = new ArrayList<Salad>();
	private List<Salmon> salmonList = new ArrayList<Salmon>();
	private List<Smoothie> smoothieList = new ArrayList<Smoothie>();


	public boolean recipeManager(String item, int portion) {

		boolean result = false;

		switch (item) {
		case "cake":
			if (portion == 1 || portion == 2) {
				cakeList.add(new Cake(portion));
				result = true;
			} else {
				break;
			}
			break;
		case "chicken":
			if (portion == 1 || portion == 2) {
				chickenList.add(new Chicken(portion));
				result = true;
			} else {
				break;
			}
			break;
		case "salad":
			if (portion == 1 || portion == 2) {
				saladList.add(new Salad(portion));
				result = true;
			} else {
				break;
			}
			break;
		case "salmon":
			if (portion == 1 || portion == 2) {
				salmonList.add(new Salmon(portion));
				result = true;
			} else {
				break;
			}
			break;
		case "smoothie":
			if (portion == 1 || portion == 2) {
				smoothieList.add(new Smoothie(portion));
				result = true;
			} else {
				break;
			}
			break;
		default:
			break;
		}
		return result;
	}

	public String results() {
		double servings = 0;
	    double cakeServings = 0;
	    double chickenServings = 0;
	    double saladServings = 0;
	    double salmonServings = 0;
	    double smoothieServings = 0;
	    
	    double calories = 0;
	    double cakeCalories = 0;
	    double chickenCalories = 0;
	    double saladCalories = 0;
	    double salmonCalories = 0;
	    double smoothieCalories = 0;
	    
	    int totalCakePortion = 0;
	    int totalChickenPortion = 0;
	    int totalSaladPortion = 0;
	    int totalSalmonPortion = 0;
	    int totalSmoothiePortion = 0;
	    
	    String cakeResults = "";
	    String chickenResults = "";
	    String saladResults = "";
	    String salmonResults = "";
	    String smoothieResults = "";
	    
		String total = "";
		
		//int i = 0; i < cakeList.size(); i++
		for(Cake cake: cakeList) {
			cakeServings += cake.getServings();
			cakeCalories += cake.totalCalories();
			totalCakePortion += cake.getPortion();
			

		}
		cakeResults = String.format("The Cake with %d portion(s) will result in a %.2f servings and %.2f total calories",totalCakePortion, cakeServings, cakeCalories);
		
		
		for(Chicken chicken: chickenList) {
			chickenServings += chicken.getServings();
			chickenCalories += chicken.totalCalories();
			totalChickenPortion += chicken.getPortion();

		}
		chickenResults = String.format("The Chicken with %d portion(s) will result in a %.2f servings and %.2f total calories",totalChickenPortion, chickenServings, chickenCalories);
		
		
		for(Salad salad: saladList) {
			saladServings += salad.getServings();
			saladCalories += salad.totalCalories();
			totalSaladPortion += salad.getPortion();

		}
		saladResults = String.format("The Salad with %d portion(s) will result in a %.2f servings and %.2f total calories",totalSaladPortion, saladServings, saladCalories);
		
		
		for(Salmon salmon: salmonList) {
			salmonServings += salmon.getServings();
			salmonCalories += salmon.totalCalories();
			totalSalmonPortion += salmon.getPortion();

		}
		salmonResults = String.format("The Salmon with %d portion(s) will result in a %.2f servings and %.2f total calories",totalSalmonPortion, salmonServings, salmonCalories);
		
		
		for(Smoothie smoothie: smoothieList) {
			smoothieServings += smoothie.getServings();
			smoothieCalories += smoothie.totalCalories();
			totalSmoothiePortion += smoothie.getPortion();

		}
		smoothieResults = String.format("The Smoothie with %d portion(s) will result in a %.2f servings and %.2f total calories",totalSmoothiePortion, smoothieServings, smoothieCalories);
		
		
		
		
		servings = cakeServings + chickenServings + saladServings + salmonServings + smoothieServings;
		calories = cakeCalories + chickenCalories + saladCalories + salmonCalories + smoothieCalories;

		total = String.format("%25s%-10.2f\n%25s%-10.2f", "Total Overall Servings: ", servings, "Total Overall Calories: ", calories);
		return String.format("%s\n%s\n%s\n%s\n%s\n\n%s", chickenResults, cakeResults, saladResults, salmonResults, smoothieResults, total);
	}

	public Recipes() {
		this.cake = null;
		this.chicken = null;
		this.salad = null;
		this.salmon = null;
		this.smoothie = null;

		
	}

}

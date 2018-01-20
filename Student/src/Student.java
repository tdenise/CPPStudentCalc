
public class Student {
	private double expenses;
	private String residency;
	private double tuition;
	private String housing;
	private int mealPlan;
	
	public void setHousing(String s) {
		housing = s;
	}
	
	public String getHousing() {
		return housing;
	}
	
	public void setMealPlan(int i) {
		mealPlan = i;
	}
	
	public int getMealPlan() {
		return mealPlan;
	}
	
	public void setTuition(String residency) {
		residency = this.residency;
	}
	
	public double getTuition() {
		return tuition;
	}
	
	public void displayingExpenses(double e) {
		expenses = e;
		System.out.println("Your total expenses are: " + expenses);
	}
	
	public void calculateExpenses() {
		
	}	
	
	
}

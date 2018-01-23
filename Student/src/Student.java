
public class Student {
	private double expenses;
	private String residency;
	private double tuition;
	private String housing;
	private int mealPlan;
	
	public Student(){
		housing = "None";
		residency = "In state"; //can change defaults later if you want
		mealPlan = 14; 
	}
	

	public Student(int meal){
		mealPlan = meal; 
		housing = "None";
		residency = "In state";  
	}
	
	public Student(String res){
		residency = res; 
		housing = "None";		
		mealPlan = 14; 
	}
	
	public Student(int meal, String res){
		mealPlan = meal; 
		residency = res; 
		housing = "None"; 
	}
	
	public Student(String house, int meal, String res){
		housing = house;
		mealPlan = meal; 
		residency = res; 
	}
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
		if(residency.equalsIgnoreCase("In state")){
			tuition = 8000.00; 	
		} else if (residency.equalsIgnoreCase("Out of state")){
			tuition = 16000.00; 	
		} else {
			tuition = 48000.00; //i'm making up numbers LOL	
		}
	}
	
	public double getTuition() {
		return tuition;
	}
	
	public void calculateExpenses() {
		expenses += tuition; 
		if (housing.equalsIgnoreCase("Dorming")){
			expenses += 10000.00; 
		} else if (housing.equalsIgnoreCase("Suites")){
			expenses += 15000.00; 	
		} 
		switch(mealPlan){
			case 10:
				expenses += 3000.00; 
				break; 
			case 14:
				expenses += 4000.00; 
				break;
			case 20: 
				expenses += 5000.00; 
				break; 
			default:
				break; 
		}
	}
	
	public double getExpense() {
		return expenses;
	}
	
	public void displayExpenses() {
		calculateExpenses(); 
		expenses = getExpense(); 
		System.out.println("Your total expenses are: " + expenses);
	}
	

	
}

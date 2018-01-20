
public class Student {
	private double expenses;
	private double tuition;
	private int mealPlan;
	private String residency;
	private String housing;
	
	public static void main(String[] args) {
		
	}

	public Student(String house, int meal, String res, double tuit, double exp){
		housing = house;
		mealPlan = meal; 
		residency = res; 
		tuition = tuit;
		expenses = exp;
	}
	public void setHousing(String s){
		housing = s; 
	}
	public String getHousing(){
		return housing; 
	}
	public void setMealPlan(int i){
		mealPlan = i; 
	}
	public int getMealPlan(){
		return mealPlan; 
	}
	public void setTuition(String residence){
		
		//nested if statements
		//based on value of residence change value of tuition
	}
	public double getTuition(){
		return tuition; 
	}
	public void displayExpenses(){
		System.out.println("Total Expenses: " + expenses);
	}
	public void calculateExpenses(){
		//nested if statements for housing and increment to expenses
		//nested if statements or switch case for meal plan and increment to expenses
		expenses += tuition; 
	}
	
	
}
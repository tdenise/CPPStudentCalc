
public class Driver {
  public static void main(String[] args){
    
	Student hannah = new Student(14);
	Student alex = new Student("In state");
	
	hannah.displayExpenses(); 
	alex.displayExpenses(); 
    
    	System.out.println("The following students are displayed in the following:");
    	System.out.println("Hannah's Expense: " + hannah.getExpense() + "\tTuitiion: " + hannah.getTuition() + "\tHousing: " + hannah.getHousing() + "\tMeal Plan: " + hannah.getMealPlan());
    	System.out.println("Alex's Expense: " + alex.getExpense() + "\tTuitiion: " + alex.getTuition() + "\tHousing: " + alex.getHousing() + "\tMeal Plan: " + alex.getMealPlan()); 
    
  }
  

}

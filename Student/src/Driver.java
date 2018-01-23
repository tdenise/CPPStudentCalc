
public class Driver {
	public static void main(String[] args){
		Student hannah = new Student(14);
		Student alex = new Student("In state");
	
		displayStudents(hannah, alex);

    
  }
  
	public static void displayStudents(Student hannah, Student alex){   
		System.out.println("The following students are displayed in the following:");
    	System.out.println("Hannah's Total Expenses: " + hannah.getExpense() + "\tTuitiion: " + hannah.getTuition() + "\tHousing: " + hannah.getHousing() + "\tMeal Plan: " + hannah.getMealPlan());
    	System.out.println("Alex's Total Expenses: " + alex.getExpense() + "\tTuitiion: " + alex.getTuition() + "\tHousing: " + alex.getHousing() + "\tMeal Plan: " + alex.getMealPlan());
    	}  
  

}

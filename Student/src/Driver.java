public class Driver {
	public static void main(String[] args){
		Student hannah = new Student("Dorming", 14, "In state");
		Student alex = new Student("In state");
		
		displayStudents(hannah, alex);

    
  }
  
	public static void displayStudents(Student hannah, Student alex){   
		System.out.println("The following students are displayed in the following:");
    		System.out.print("Hannah,");
    		hannah.displayExpenses();
    		System.out.println("\tTuition: " + hannah.getTuition() + "\tHousing: " + hannah.getHousing() + "\tMeal Plan: " + hannah.getMealPlan()); 
    		System.out.print("Alex,");
    		alex.displayExpenses();
    		System.out.println("\tTuition: " + alex.getTuition() + "\tHousing: " + alex.getHousing() + "\tMeal Plan: " + alex.getMealPlan());
    	}  
  

}

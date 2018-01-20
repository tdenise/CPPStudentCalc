
public class Driver {
  public static void main(String[] args){
    
    Student hannah = new Student(14);
    Student alex = new Student("In state"); 
    
    hannah.calculateExpenses(); 
    alex.calculateExpenses();
    hannah.displayExpenses(); 
    
    displayStudents(); 
    
  }
  
  public static void displayStudents(){
    System.out.println("The following students are displayed in the following:");
    System.out.println("Hannah: Expense: " + hannah.getExpense() + " Tuitiion: " + hannah.getTuition() + "Housing: " + hannah.getHousing() + "Meal Plan: " + hannah.getMealPlan());
    System.out.println("Alex: Expense: " + alex.getExpense() + " Tuition: " + alex.getTuition() + "Housing: " + alex.getHousing() + "Meal Plan: " + alex.getMealPlan());
  }

}

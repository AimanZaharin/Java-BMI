
public class UseBMIClass {
  public static void main(String[] args) {
	  
    BMI bmi1 = new BMI("John Fab", 18, 145, 70);
    
    System.out.println("The BMI for " + bmi1.getName() + " who is " + bmi1.getAge() + " years old is "
      + bmi1.getBMI() + " " + bmi1.getStatus());
    
    BMI bmi2 = new BMI("Joshua Peter", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " who is " + bmi2.getAge() + " years old is "
      + bmi2.getBMI() + " " + bmi2.getStatus());
  }
}

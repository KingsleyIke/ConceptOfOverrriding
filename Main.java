class Main {
  public static void main(String[] args) {


//composition    
//engine is a composition of car

Engine newengine = new Engine("");
Car newcar = new Car(newengine);

//aggregation 
//Address is an aggregation of student
Address newAddress = new Address("Lekki", "Lagos");
Student newStudent = new Student("Charity", "Mark", newAddress);


//Inheritance Overriding
Staff tola = new Staff ("Green", true);
 tola.setIdCardColor("Yellow");
  
System.out.println(tola.getIdCardColor());


Principals mike = new Principals ("", true);
  mike.setIdCardColor("Red");

  System.out.println(mike.getIdCardColor());

Teachers grace = new Teachers ("..", false, false);
  grace.setIdCardColor("..");
  

System.out.println(grace.getIdCardColor());

NonAcademicStaff adam = new NonAcademicStaff("..");
  adam.setIdCardColor("..");

System.out.println(adam.getIdCardColor());

  }  

}




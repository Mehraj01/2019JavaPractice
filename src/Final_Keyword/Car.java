package Final_Keyword;

public class Car {
	
  private String model;
	
  public Car(String model) {
	this.model =model;
}
  
  public String getModel() {
	return model;
}
  public void setModel(String model) {
	this.model = model;
}
	
	public static void main(String[] args) {
		Car car2 = new Car("GMC");
		final Car car = new Car("KIA");
		car.getModel();
		car.setModel("Audi");
		
		//We can not assigne car new Car object
		//car = new Car("BMW"); ///will not wor
		
		car2 = new Car("Chevi");
	}

}

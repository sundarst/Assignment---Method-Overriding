class  Vehicle
{
	public void start()
	{
		System.out.println("Start vechile");
	}
	
	public void stop()
	{
		System.out.println("Vehicle stop");
	}	

}
class Bike extends Vehicle
{
	public void start()
	{
		System.out.println(" Bike Start");
	}
	
	public void stop()
	{
		System.out.println("Bike stop");
	}

}
class Car extends Vehicle
{
	public void start()
	{
		System.out.println("car Start");
	}
	
	public void stop()
	{
		System.out.println("car stop");
	}
}
public class DemoHierarchy
{
public static void main(String[] args)
{
	Car car = new Car();
	car.start();
	car.stop();
	


}
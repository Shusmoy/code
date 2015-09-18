/**
 * Created by Shusmoy on 9/18/2015.
 */
public class Car {
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelcapacity;
    public Car( String name, String manufacturer,Driver driver,int fuelcapacity)
    {
        this.name=name;
        this.manufacturer=manufacturer;
        this.driver=driver;
        this.fuelcapacity=fuelcapacity;
    }
    public Car(String name, String manufacturer)
    {
        this.name=name;
        this.manufacturer=manufacturer;
    }
    public String getName(){return this.name;}
    public String getManufacturer(){return  this.manufacturer;}
    public Driver getDriver(){return this.driver;}
    public int getFuelCapacity(){return this.fuelcapacity;}
    public void refuel(int refuel){
        System.out.println(fuelcapacity+refuel);
    }
    public void drive(int drive)
    {
        if(drive>fuelcapacity) System.out.println("Not possible");
        else System.out.println(fuelcapacity-drive);
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setFuelCapacity(int fuelcapacity) {
        this.fuelcapacity = fuelcapacity;
    }
    public void print()
    {
        System.out.println(name+ " Manufacturer: "+manufacturer);
        driver.print();
        System.out.println("FuelCapacity: "+fuelcapacity);
    }
}

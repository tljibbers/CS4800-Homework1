package Ship;

public class Ship {
     String name;
     String yearBuilt;
     
     public void setName(String name)
     {
        this.name = name;
     }

     public void setyearBuilt(String yearBuilt)
     {
        this.yearBuilt = yearBuilt;
     }

     public String getName()
     {
        return this.name;
     }

     public String getYearBuilt()
     {
        return this.yearBuilt;
     }

     public void print()
     {
        System.out.println("The name of the ship is " + this.getName() + " and the year that it was built was " + this.getYearBuilt());
     }
}

class CruiseShip extends Ship {
    int maxNoOfPassengers;

    public void setMaxNoOfPassengers(int maxNoOfPassengers)
    {
        this.maxNoOfPassengers = maxNoOfPassengers;
    }

    public int getMaxNoOfPassengers()
    {
        return this.maxNoOfPassengers;
    }
    
    public void print()
    {
        System.out.println("The name of the ship is " + this.getName() + " and the max number of passengers is " + this.getMaxNoOfPassengers());
    }

}

class CargoShip extends Ship {
    int cargoCapacity;

    public void setCargoCapacity(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity()
    {
        return this.cargoCapacity;
    }

    public void print()
    {
        System.out.println("The name of the ship is " + this.getName() + " and the ships cargo capacity is " + this.getCargoCapacity());
    }
}

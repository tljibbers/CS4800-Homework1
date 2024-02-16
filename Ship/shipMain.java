package Ship;

public class shipMain {

    public static void main(String[] args)
    {
        Ship voyager = new Ship();
        CruiseShip oasis = new CruiseShip();
        CargoShip tanker = new CargoShip();

        Ship[] shipArray = {voyager, oasis, tanker};

        voyager.setName("Voyager");
        voyager.setyearBuilt("1998");

        oasis.setName("Oasis");
        oasis.setMaxNoOfPassengers(250);

        tanker.setName("Tanker");
        tanker.setCargoCapacity(15);

       for(int i = 0; i < shipArray.length; i++)
       {
            shipArray[i].print();
       }
    }
    
}

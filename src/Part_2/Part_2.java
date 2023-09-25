package Part_2;

class Sewing {
    // 2.1 Private properties
    private String item;
    // 2.1 Getters and setters
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    // 2.1 Private properties
    private String textile;
    // 2.1 Private properties
    private double totalTimeToSewInHours;
    // 2.1 Private properties
    private int quantitiesOfItems;
    // 2.1 Getters and setters
    public int getQuantitiesOfItems() {
        return quantitiesOfItems;
    }
    public void setQuantitiesOfItems(int quantitiesOfItems) {
        this.quantitiesOfItems = quantitiesOfItems;
    }
    // 2.1 Private properties
    private boolean wearToOffice;
    // 2.1 Private properties
    private String colour;
    //2.2 Constructor
    public Sewing(String textile, double totalTimeToSewInHours, String colour) {
        this.textile = textile;
        this.totalTimeToSewInHours = totalTimeToSewInHours;
        this.colour = colour;
    }

    // 2.3 Method which perform a logic on the base of its properties
    public double theAverageAmountOfTimeFor1Item() {
        if (quantitiesOfItems > 0) {
            return totalTimeToSewInHours / quantitiesOfItems;
        } else {
            return 0.0;
        }
    }
    // 2.3 Method which perform a logic on the base of its properties
    public boolean checkIfItIsForOffice() {
        if (colour.equalsIgnoreCase("black") || colour.equalsIgnoreCase("white"))
            wearToOffice = true;
        else {
            wearToOffice = false;
        } return wearToOffice;
    }
    // 2.3 Method
    public void printSewingInfo() {
        System.out.println("Type of textile: " + textile);
        System.out.println("Total time to sew in hours: " + totalTimeToSewInHours);
        System.out.println("Can be worn to the office: " + wearToOffice);
    }
}
public class Part_2 {
    public static void main(String[] args) {
        // 2.4 Several objects of this class with different property values
        System.out.println("The information of the first sewing project:");
        Sewing object1 = new Sewing("Cotton", 12.7, "white");
        object1.setItem("T-Shirt");
        System.out.println("The type of item: " + object1.getItem());
        object1.setQuantitiesOfItems(4);
        System.out.println("The quantity of items: " + object1.getQuantitiesOfItems());
        object1.checkIfItIsForOffice();
        System.out.println("The average time for 1 item to sew: " + object1.theAverageAmountOfTimeFor1Item());
        object1.printSewingInfo();

        // 2.4 Several objects of this class with different property values
        System.out.println("\nThe information of the second sewing project:");
        Sewing object2 = new Sewing("Silk", 74.8, "green");
        object2.setItem("Dress");
        System.out.println("The type of item: " + object2.getItem());
        object2.setQuantitiesOfItems(2);
        System.out.println("The quantity of items: " + object2.getQuantitiesOfItems());
        object2.checkIfItIsForOffice();
        object2.checkIfItIsForOffice();
        System.out.println("The average time for 1 item to sew: " + object2.theAverageAmountOfTimeFor1Item());
        object2.printSewingInfo();
    }
}

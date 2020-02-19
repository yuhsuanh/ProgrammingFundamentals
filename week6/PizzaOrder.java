
/**
 * Write a description of class PizzaOrder here.
 *
 * @author Yu-Hsuan Huang 
 */
public class PizzaOrder {
    private int size; //pizza size
    private int topping; //pizza topping number
    private double cost; // cost
    private double tip; //tip

    // Constructor with no argument
    public PizzaOrder() {}
    // Constructor with 4 arguments
    public PizzaOrder(int size, int topping, double cost, double tip) {
        this.size = size;
        this.topping = topping;
        this.cost = cost;
        this.tip = tip;
    }

    // Getter and Setter
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTopping() {
        return topping;
    }

    public void setTopping(int topping) {
        this.topping = topping;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    
    /* 
     * Toppings
     * Depend on your cost and number of topping
     * It will print the toppings and return the toppings
     */
    public String chooseToppings() {
        String toppings = "";
        // Your cost equal to or greater than 5 AND cost equal to or less than 8
        if(cost >= 5 && cost <= 8) {
            //What number of toppings
            switch(topping) {
                case 2:
                    toppings = "Cheese, peperoni";
                    break;
                case 3:
                    toppings = "Cheese, peperoni, tomato";
                    break;
                default:
                    toppings = "This is wrong topping number";
            }
        }
        // Your cost equal to or greater than 9 AND cost equal to or less than 11
        if(cost >=9 && cost <= 11) {
            //What number of toppings
            switch(topping) {
                case 3:
                    toppings = "Cheese, peperoni, chicken";
                    break;
                case 4:
                    toppings = "Cheese, peperoni, chicken, mushrooms";
                    break;
                default:
                    toppings = "This is wrong topping number";
            }
        }
        
        System.out.println("You choose toppings: " + toppings);
        return toppings;
    }
    
    /*
     * Order Summary
     * Concatenation of the complete state
     * Return the Summary
     */
    public String getOrderSummary() {
        String summary = "";
        String toppings = this.chooseToppings();
        boolean hasSteak = false;
        
        // Tip greater than 5 dollar, we will give a topping
        if(tip > 5) {
            // chicken or steak
            if(toppings.indexOf("chicken") >= 0) {
                hasSteak = true;
                toppings = toppings + ", steak";
            } else 
                toppings = toppings + ", chicken";
        }
        // concat summary
        summary += "We give toppings: " + toppings + "\n";
        summary += "Size: " + size + "\n";
        summary += "Number Of Toppings: " + topping + "\n";
        summary += "Cost: " + cost + "\n";
        summary += "Tip: " + tip + "\n";
        
        // Notice
        if(hasSteak)
            summary += "Thank you for your generous tip, steak was substituted for chicken in your order.\n";
        
        return summary;
    }
}


/**
 * Write a description of class PizzaOrderTestHarness here.
 *
 * @author Yu-Hsuan Huang
 */
public class PizzaOrderTestHarness{
    
    public static void main(String[] args) {
        // Pizza Order 1
        PizzaOrder order1 = new PizzaOrder(8, 3, 10, 3);
        System.out.println(order1.getOrderSummary());
        
        // Pizza Order 2
        PizzaOrder order2 = new PizzaOrder();
        order2.setSize(10);
        order2.setTopping(4);
        order2.setCost(11);
        order2.setTip(10);
        System.out.println(order2.getOrderSummary());
    }
    
}

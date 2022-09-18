public class SalesTax {

    public static void main(String[] args) {
       double price = 75.99;
        double tax = price * 0.05;


        System.out.printf("Sales tax is $%.2f\n", tax);
        double totalAmount = price + tax;
        System.out.printf("The total amount is $ %.2f\n", totalAmount);
    }

}
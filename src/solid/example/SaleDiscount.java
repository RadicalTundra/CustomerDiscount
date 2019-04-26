
package solid.example;

public class SaleDiscount implements DiscountStrategy{

    @Override
    public double getDiscountAmmount(double amount) {
        return amount - amount * 0.10;
    }
    
    @Override
    public String toString(){
        return "Sale Discount";
    }
    
}

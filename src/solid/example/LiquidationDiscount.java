package solid.example;

public class LiquidationDiscount implements DiscountStrategy{

    @Override
    public double getDiscountAmmount(double amount) {
        return amount - amount * 0.75;
    }
    
    @Override
    public String toString(){
        return "Liquidation Discount";
    }
    
}

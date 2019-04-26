package solid.example;

public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscountAmmount(double amount) {
        return amount;
    }
    
    @Override
    public String toString(){
        return "No Discount";
    }
}

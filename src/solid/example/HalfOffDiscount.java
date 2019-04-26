package solid.example;


public class HalfOffDiscount implements DiscountStrategy{
    
    @Override
    public double getDiscountAmmount(double amount) {
        return amount - amount * 0.50;
    }
    
    @Override
    public String toString(){
        return "HalfOffDiscount";
    }
}

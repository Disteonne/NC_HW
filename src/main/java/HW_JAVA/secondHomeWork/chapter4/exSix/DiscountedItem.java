package HW_JAVA.secondHomeWork.chapter4.exSix;

import java.util.Objects;

public class DiscountedItem extends Item{
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof DiscountedItem){
            DiscountedItem that = (DiscountedItem) o;
            return Double.compare(that.discount, discount) == 0;
        }
        else if(!super.equals(o)) {
            Item item=(Item) o;
            return Double.compare(getPrice(),item.getPrice())==0 && getDescription().equals(item.getDescription());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount);
    }
}

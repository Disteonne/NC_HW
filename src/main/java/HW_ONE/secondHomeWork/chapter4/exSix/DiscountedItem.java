package HW_ONE.secondHomeWork.chapter4.exSix;

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
        if (!(o instanceof DiscountedItem)) return false;
        if (!super.equals(o)) return false;
        DiscountedItem that = (DiscountedItem) o;
        return Double.compare(that.discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount);
    }
}

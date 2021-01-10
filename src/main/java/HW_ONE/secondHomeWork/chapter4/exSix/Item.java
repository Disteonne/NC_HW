package HW_ONE.secondHomeWork.chapter4.exSix;

import java.util.Objects;

public class Item {
        private String description;
        private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
            if (this == otherObject) return true;
            if (otherObject == null) return false;
            if ( !(otherObject instanceof Item )) return false;
            Item other = (Item) otherObject;
            return Objects.equals(description, other.description)
                    && price == other.price;
        }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

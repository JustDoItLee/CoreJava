package CoreJava.day_6;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author 李智
 * @date 2016/12/20
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartNumber) {
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String toString() {
        return "[descriptin =" + description + ",partNumber = " + partNumber + "]";
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(partNumber, o.partNumber);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    public int hashCode() {
        return Objects.hash(description, partNumber);
    }
}

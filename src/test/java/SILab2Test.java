import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void everyBranch() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Kaskaval", "0895", 500, 20));
        items.add(new Item("Chips", "7543", 67, 30));
        items.add(new Item("Jogurt", "1965", 90, 0));
        int payment1 = 15000;
        assertTrue(SILab2.checkCart(items,payment1));

        List<Item> items2 = new ArrayList<Item>();
        items2.add(new Item("Pavlaka", "3333", 150, 0));
        items2.add(new Item("Chips", "7543", 67, 30));
        int payment2 = 1000;
        assertFalse(SILab2.checkCart(items2,payment2));

        //Test case with exception : allItems list can't be null!
        List<Item> items3 = null;
        RuntimeException exception3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items3,1000));
        assertEquals("allItems list can't be null!", exception3.getMessage());

        //Test case with exception : Invalid character in item barcode
        List<Item> items4 = new ArrayList<Item>();
        items4.add(new Item("Leb", "z367", 30, 5));
        RuntimeException exception4 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items4,3500));
        assertEquals("Invalid character in item barcode!", exception4.getMessage());

        //Test case with exception : No barcode
        List<Item> items5 = new ArrayList<Item>();
        items5.add(new Item("Meso", null, 345, 3));
        RuntimeException exception5 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items5,3500));
        assertEquals("No barcode!", exception5.getMessage());
    }

    @Test
    public void unitTesting() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Kaskaval", "0895", 500, 20));
        int payment = 10000;
        assertTrue(SILab2.checkCart(items,payment));

        List<Item> items1 = new ArrayList<Item>();
        items1.add(new Item("Vino", "7562", 350, 2));
        int payment2 = 10000;
        assertTrue(SILab2.checkCart(items1,payment2));

        List<Item> items2 = new ArrayList<Item>();
        items2.add(new Item("Meso", "0369", 367, 0));
        int payment3 = 10000;
        assertTrue(SILab2.checkCart(items2,payment3));

        List<Item> items3 = new ArrayList<Item>();
        items.add(new Item("Sirenje", "7543", 561, 3));
        int payment4 = 10000;
        assertTrue(SILab2.checkCart(items3,payment4));

        List<Item> items4 = new ArrayList<Item>();
        items.add(new Item("Zejtin", "0123", 200, 5));
        int payment5 = 10000;
        assertTrue(SILab2.checkCart(items4,payment5));

        List<Item> items5 = new ArrayList<Item>();
        items.add(new Item("Pavlaka", "1234", 100, 3));
        int payment6 = 10000;
        assertTrue(SILab2.checkCart(items5,payment6));

        List<Item> items6 = new ArrayList<Item>();
        items.add(new Item("Jogurt", "0985", 123, 0));
        int payment7 = 10000;
        assertTrue(SILab2.checkCart(items6,payment7));

        List<Item> items7 = new ArrayList<Item>();
        items.add(new Item("Sok", "5678", 50, 0));
        int payment8 = 10000;
        assertTrue(SILab2.checkCart(items7,payment8));
    }
}

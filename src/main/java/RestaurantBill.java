import java.math.BigDecimal;
import java.util.List;

public class RestaurantBill {
    private List<Item> listOfItems;

    private static final BigDecimal taxRate = new BigDecimal("0.10");
    private static final BigDecimal tipRate = new BigDecimal("0.18");

    public RestaurantBill(List<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    BigDecimal computeTotalWithTax() {
        BigDecimal total = new BigDecimal(0);
        for (Item item : listOfItems) {
            total = total.add(item.getPrice().multiply(new BigDecimal(item.getQuantity())));
        }
        return total.add(total.multiply(taxRate));
    }

    BigDecimal computeTotalWithTip() {
        BigDecimal total = new BigDecimal(0);

        for (Item item : listOfItems) {
            total = total.add(item.getPrice().multiply(new BigDecimal(item.getQuantity())));
        }
        return total.add(total.multiply(tipRate));
    }

    BigDecimal computeTotalWithTaxAndTip() {
        BigDecimal total = new BigDecimal(0);
        for (Item item : listOfItems) {
            total = total.add(item.getPrice().multiply(new BigDecimal(item.getQuantity())));
        }
        return total.add(total.multiply(taxRate).add(total.multiply(tipRate)));
    }

    void printItemizedReceipt() {
        String output = "";

        for (Item item : listOfItems) {
            output += item.getName() + "(" + item.getQuantity() + ") $" + item.getPrice().multiply(new BigDecimal(item.getQuantity())) + "\n";
        }

        output += "--------------------\n";
        output += "tax:          " + "$" + this.computeTotalWithTax() + "\n";
        output += "--------------------\n";
        output += "tip:          " + "$" + this.computeTotalWithTip() + "\n";
        output += "--------------------\n";
        output += "total:        " + "$" + this.computeTotalWithTaxAndTip() + "\n";
        System.out.println(output);
    }

}

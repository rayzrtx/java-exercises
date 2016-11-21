/**
 * Created by raylinares on 11/21/16.
 */
public enum Color {
    RED(0),
    BLUE(.10),
    YELLOW(.25),
    GREEN(.35),
    PURPLE(.50),
    PINK(1);

    private final double discountPercentage;

    Color(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public double applyDiscount(double payment){
        double totalDiscount;
        totalDiscount = payment - (payment * discountPercentage);
        return totalDiscount;
    }
}


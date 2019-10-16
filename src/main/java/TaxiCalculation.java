public class TaxiCalculation {
    double tripOptions(double distance,
                       int landingAmount,
                       int costOneKilometer,
                       double discount,
                       int minimumDiscountAmount,
                       int maximumDiscount,
                       int discountPercentage,
                       int maximumDiscountPercentage) {
        double cost = landingAmount + distance * costOneKilometer;
        if (cost > minimumDiscountAmount) {
            discount = cost * discountPercentage / maximumDiscountPercentage;
        }
        if (discount <= maximumDiscount) {
            cost -= discount;
        }
        if (discount > maximumDiscount) {
            cost -= maximumDiscount;
        }
        return cost;
    }
}

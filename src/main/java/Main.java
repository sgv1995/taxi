public class Main {
    public static void main(String[] args) {
        double distance = 7.5;
        int landingAmount = 60;
        int costOneKilometer = 20;
        double cost;
        double discount = 0;
        int minimumDiscountAmount = 1000;
        int maximumDiscount = 100;
        int discountPercentage = 5;
        int maximumDiscountPercentage = 100;

        cost = landingAmount + distance * costOneKilometer;
        if (cost > minimumDiscountAmount) {
            discount = cost * discountPercentage / maximumDiscountPercentage;
        }
        if (discount <= maximumDiscount) {
            cost -= discount;
        }
        if (discount > maximumDiscount) {
            cost -= maximumDiscount;
        }
        System.out.println("Стоимость поездки: " + cost);

    }

}


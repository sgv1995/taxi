public class Main {
    public static void main(String[] args) {
        taxiCalculation taxi = new taxiCalculation();
        double cost = taxi.tripOptions(7.5, 60, 20, 0, 1000, 100, 5, 100);
        System.out.println("Стоимость поездки: " + cost);
    }
}


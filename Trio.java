public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich s, Salad sa, Drink d) {
        this.sandwich = s;
        this.salad = sa;
        this.drink = d;
    }

    @Override
    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    @Override
    public double getPrice() {
        double a = sandwich.getPrice();
        double b = salad.getPrice();
        double c = drink.getPrice();

        // sum of two highest
        double sum = a + b + c - Math.min(a, Math.min(b, c));
        return sum;
    }
}

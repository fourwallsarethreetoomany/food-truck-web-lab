public class Main {
    public static void main(String[] args) {

        Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
        Salad spinach = new Salad("Spinach Salad", 1.25);
        Drink orange = new Drink("Orange Soda", 1.25);

        Trio t1 = new Trio(cheeseburger, spinach, orange);

        System.out.println(t1.getName());
        System.out.println("Price: $" + t1.getPrice());

        Sandwich club = new Sandwich("Club Sandwich", 2.75);
        Salad coleslaw = new Salad("Coleslaw", 1.25);
        Drink cappuccino = new Drink("Cappuccino", 3.50);

        Trio t2 = new Trio(club, coleslaw, cappuccino);

        System.out.println(t2.getName());
        System.out.println("Price: $" + t2.getPrice());
    }
}

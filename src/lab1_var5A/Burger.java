package lab1_var5A;

public class Burger extends Food
{
    private final String size;
    public Burger(String size) {
        super("Бургер");
        this.size = size;
    }
    public void consume() {
        System.out.println(name + " размера '" + size.toUpperCase() + "' съеден!");
    }
}
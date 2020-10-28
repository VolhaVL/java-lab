package lab1_var5A;

public class Apple extends Food {
    private String size;
    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }
    public void consume() {
        System.out.println(name + " размера '" + size.toUpperCase() + "' съедено!");
    }
}
package lab1_var5A;

public class Breakfast {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg1 : args) {
            String[] part = arg1.split("/");
            if (part[0].equals("Burger")) {
                Burger burger = new Burger(part[1]);
                burger.consume();
                sum++;}
            else if (part[0].equals("Cheese")){
                Cheese cheese = new Cheese();
                cheese.consume();
                sum++;}
        }
        System.out.println("Количество съеденных продуктов:  " + sum);
    }
}

package lab1_var5A;

public class Breakfast {
    public static void main(String[] args) {
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        for (String arg1 : args) {
            String[] part = arg1.split("/");
            if (part[0].equals("Burger")) {
                Burger burger = new Burger(part[1]);
                burger.consume();
                sumB++;}
            else if (part[0].equals("Cheese")){
                Cheese cheese = new Cheese();
                cheese.consume();
                sumC++;}
            else if (part[0].equals("Apple")){
                Apple apple = new Apple(part[1]);
                apple.consume();
                sumA++;
            }
        }
        System.out.println("Количество съеденных продуктов:  " + (sumA+sumB+sumC));
        System.out.println("Яблок съедено: " + sumA);
        System.out.println("Бургеров съедено: " + sumB);
        System.out.println("Сыра съедено: " + sumC);
    }
}

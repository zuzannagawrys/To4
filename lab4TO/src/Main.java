import java.util.Scanner;

class Main {
    public static final int N = 15; //X length of the area
    public static final int M = 10; //Y length of the area
    public static final int B = 300; //healthy beginners
    public static final int E = 2; //people entering every 1/25 s

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        People population = new People();
        System.out.println("press n to create population with no immunity\npress p to create population with partial immunity");
        while (!input.hasNext("[np]")) {
            System.out.println("press n to create population with no immunity\npress p to create population with partial immunity");
            input.next();
        }
        String letter = input.next();
        if (letter.equals("n"))
            population.createPopulationWithNoImmunity(B);
        else
            population.createPopulationWithPartialImmunity(B);
        DrawRect.draw(population);




    }
}
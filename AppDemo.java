import java.util.Scanner;

public class AppDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Co chcesz narysować: (rectangle / square / tree )");
        String choice = sc.nextLine();

        switch (choice) {
            case "square":
                System.out.println("Podaj długosć boku: ");
                int side = sc.nextInt();
                Square square = new Square(side);
                square.draw();
                break;
            case "rectangle":
                System.out.println("Podaj długosć boku a: ");
                int sideA = sc.nextInt();
                System.out.println("Podaj długosć boku b: ");
                int sideB = sc.nextInt();
                Rectangle rectangle = new Rectangle(sideA, sideB);
                rectangle.draw();
                break;
            case "tree":
                System.out.println("Podaj wysokosć: ");
                int height = sc.nextInt();
                Tree tree = new Tree(height);
                tree.draw();
                break;
        }
    }
}

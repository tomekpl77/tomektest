import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String [] abc = new String[]{"A","B","C","D", "E"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide name");
        String name1= scanner.nextLine();
        System.out.println(name1);

        Human human = new Human(29, 85, 192, "Tomek", "Github");
        System.out.println(human);
        Prostokąt prostokąt = new Prostokąt(5, 2.5);
        prostokąt.ob();
        prostokąt.pole();
        prostokąt.prz();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String [] abc = new String[]{"A","B","C","D", "E"};
        System.out.println(Arrays.toString(abc));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide name");
        String name1= scanner.nextLine();
        System.out.println(name1);

        Human human = new Human(29, 85, 192, "Tomek", "Github");
        System.out.println(human);

        Prostokąt prostokąt = new Prostokąt(2, 4);
        prostokąt.ob();
        prostokąt.pole();
        prostokąt.prz();

        MyNumber myNumber = new MyNumber(12.0);
        System.out.println(myNumber.myNumberIsOdd());
        System.out.println(myNumber.myNumberisEven());
        System.out.println(myNumber.myNumberAdd(new MyNumber(3)));
        System.out.println(myNumber.myNumberSubstract(new MyNumber(3)));
    }
}

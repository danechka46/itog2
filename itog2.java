import java.util.Scanner;

public class itog2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ввод: ");
        String str = s.nextLine();
        int x,y = 0;
        if (str.startsWith("x")) {
            x = Character.getNumericValue(str.charAt(2));
            y = Character.getNumericValue(str.charAt(4));
            if (str.charAt(1) == '+')
                System.out.println("Вывод: " + (y - x));
            else
                System.out.println("Вывод: " + (y + x));
        }

        if(str.charAt(2)=='x') {
            x = Character.getNumericValue(str.charAt(0));
            y = Character.getNumericValue(str.charAt(4));
            if (str.charAt(1) == '+')
                System.out.println("Вывод: " + (y - x));
            else
                System.out.println("Вывод: " + (x - y));
        }

        if(str.charAt(4)=='x'){
            x = Character.getNumericValue(str.charAt(0));
            y = Character.getNumericValue(str.charAt(2));
            if (str.charAt(1) == '+')
                System.out.println("Вывод: "+(y+x));
            else
                System.out.println("Вывод: "+(y-x));
        }
    }
}

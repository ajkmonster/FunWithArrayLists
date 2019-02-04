import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        String y;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter in 3 different color: ");
        for (int x=0; x<=2; x++) {
            colors.add(key.next());
        }
        for (String s: colors){
            System.out.println(s);
        }
        System.out.println(colors.get(1));
        do {
            Scanner key2 = new Scanner(System.in);
            System.out.println("Would you like to enter a new color? (Y/N): ");
            y = key2.next();
            while(!y.equalsIgnoreCase("n")) {
                    Scanner key3 = new Scanner(System.in);
                    System.out.println("Please enter a new color or enter Q to quit: ");
                    y = key3.next();
                    if (y.equalsIgnoreCase("q")) {
                        break;
                    }
                    colors.add(y);
            }
        } while (!y.equalsIgnoreCase("q"));
        System.out.println("Our new list of colors: ");
        for (String g:colors){
            System.out.println(g);
        }
        }
    }

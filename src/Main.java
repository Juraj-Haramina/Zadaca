import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Molim vas unesite jedan broj:");

        int unesenibroj1= scanner.nextInt();

        System.out.println("Molim vas unesite drugi broj :");

        int unesenibroj2= scanner.nextInt();

        int zbroj= unesenibroj1 + unesenibroj2;

        System.out.println("Zbroj je "  + zbroj);



    }
}
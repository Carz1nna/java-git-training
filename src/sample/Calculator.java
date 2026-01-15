package sample;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);
        int fst = scanner.nextInt();
        int scnd = scanner.nextInt();

        int dei = scanner.nextInt(); // 1+2-3*4/5^
        switch (dei) {
            case '1':
                int plus = fst+scnd;
            case '2':
                int minus = fst-scnd;
            case '3':
                int umn = fst*scnd;
            case '4':
                int del = fst/scnd;
        }

        int plus = fst+scnd;
        int minus = fst-scnd;
        int umn = fst*scnd;
        int del = fst/scnd;
        return fst;


    }

    public static <scnd, fst> int power (fst, scnd) {
        int pow = fst^scnd;
    }
    switch (dei) {
        case '1':
            System.out.println(plus);
        case '2':
            System.out.println(minus);
        case '3':
            System.out.println(umn);
        case '4':
            System.out.println(del);
        case '5':
            System.out.println(pow);
    }
    System.out.println()
}

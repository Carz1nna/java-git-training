package sample;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        Scanner scanner = new scanner(System.in);
        int fst = scanner.nextInt();
        int scnd = scanner.nextInt();

        int plus = fst+scnd;
        int minus = fst-scnd;
        int umn = fst*scnd;
        int del = fst/scnd;
    }
}

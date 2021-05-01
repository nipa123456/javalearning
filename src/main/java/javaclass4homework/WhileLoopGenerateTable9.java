package javaclass4homework;

public class WhileLoopGenerateTable9 {
    public static void main(String[] args) {
        int n = 1;
        int n1 = 9;
        System.out.println("Table of nine");


        while (n <= 10) {
            System.out.println(n1 + " * " + n + " = " + (n1 * n));
            n++;
        }
    }
}

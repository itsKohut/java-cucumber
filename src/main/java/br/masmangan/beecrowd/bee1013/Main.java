package br.masmangan.beecrowd.bee1013;

import java.util.Scanner;

import static java.lang.System.out;


public class Main {

    public static void main(String[] args) {

        GreaterNumber greaterNumber = new GreaterNumber();
        Scanner in = new Scanner(System.in);

        greaterNumber.setA(in.nextInt());
        greaterNumber.setB(in.nextInt());
        greaterNumber.setC(in.nextInt());

        in.close();

        int maior = greaterNumber.getGreater();

        out.printf("%d eh o maior", maior);
    }
}

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
//        Tema1.E10.
//        Ceva mai simplu:
//        Realizati un proiect Java ce citeste de la tastatura un numar n si apoi afiseaza la consola urmatorul pattern:
//        input:
//        5
//        output:
//*
//**
//***
//****
//*****
        System.out.println("Please, give a number: ");
        Scanner scanner = new Scanner(System.in);
        //citesc numarul pentru care fac afisarea pattern
        int n = scanner.nextInt();
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}

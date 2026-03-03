package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("digite um valor: ");
            int a = sc.nextInt();

            System.out.println("Digite outro valor: ");
            int b = sc.nextInt();

            int Resultado = a / b;

            System.out.println("resultado = " + Resultado);

        } catch (ArithmeticException e){
            System.out.println("erro nao da pra dividir por 0!!!!");
        }catch (InputMismatchException ex){
            System.out.println("erro: nao pode colocar letras!!" );
        } catch (Exception ex2){
            System.out.println("Erro: " + ex2.getMessage());
        }
    }
}
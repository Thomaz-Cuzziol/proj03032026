package org.example;

public class ExThrow {

    static void ValidarIdade (int Idade)
    {

        if (Idade < 18)
        {
            throw new IllegalArgumentException("idade minima é 18 anos");
        }
        System.out.println("acesso liberado!");
    }

    public static void main(String[] args)
    {
        ValidarIdade(15);
    }
}

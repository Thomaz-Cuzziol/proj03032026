package org.example;

public class Expersonalizada {
    static void sacar(double saldo, double valor) throws
            SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException
                    ("saldo insuficiente, Saldo:" + saldo);
        }

    }

    public static void main(String[] args) {
        try {
            sacar(100,500);
        }catch (SaldoInsuficienteException e)
        {
            System.out.println("erro: " + e.getMessage());
        }
    }
}

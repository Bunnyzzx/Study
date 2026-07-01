package org.example;

public class Cliente {
    private String nome;
    private String tipoConta;
    private double saldo;

    // Construtor
    public Cliente(String nome, String tipoConta, double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    // getter/setter nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // getter/setter tipoConta
    public String getTipoConta() {
        return this.tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    // getter/setter saldo
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void transferir(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
        }
    }
}
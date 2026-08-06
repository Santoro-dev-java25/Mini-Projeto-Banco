package ESTUDOSJAVA.ProjetinhoBanco.Entities;

public class ContaBancaria {

    public String titular;
    public int numeroConta;
    public double saldo;

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        } else {
            saldo += valor;
            return true;


        }

    }

    public boolean saque(double ret){
      if( ret <= saldo){
          saldo -= ret;
          return true;
      }
      else{
        return false;
      }

    }

    public String toString(){
        return "Titular: "+ titular + " , "+
                " Conta: "+ numeroConta + " , "+
                " Saldo: "+ saldo;

}}

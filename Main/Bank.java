package ESTUDOSJAVA.ProjetinhoBanco.Main;
import ESTUDOSJAVA.ProjetinhoBanco.Entities.ContaBancaria;

import java.util.Scanner;

public class Bank {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ContaBancaria x = new ContaBancaria();

        int escolha = 0;
        System.out.print("Titular: ");
        x.titular = leitor.nextLine();
        System.out.print("numero da conta: ");
        x.numeroConta = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Saldo: ");
        x.saldo = leitor.nextDouble();
        leitor.nextLine();
        while ( escolha != 4){
            System.out.println(" ");
            System.out.println(" [1] Sacar ");
            System.out.println(" [2] Depositar ");
            System.out.println(" [3] Vizualizar dados ");
            System.out.println(" [4] Sair ");
            System.out.println("Qual voce deseja realizar? ");
            escolha = leitor.nextInt();
            switch (escolha){
                case 1:
                    System.out.println(" ");
                    System.out.println("Qual valor voce deseja sacar: ");
                    double retirar = leitor.nextDouble();
                    if(x.saque(retirar)){
                        System.out.println("Valor retirado com sucesso! ");
                    }
                    else{
                        System.out.println("Saldo insuficiente! ");
                    }
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("Qual valor voce deseja depositar: ");
                    double deposito = leitor.nextDouble();
                   if (x.depositar(deposito)){
                       System.out.println("Deposito realizado com sucesso!");
                   }else {
                       System.out.println("Deposito invalido!");
                   }
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println(x);
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Saindo. . . ");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Somente opcoes de 1 a 4 sao validas nesse sistema!");
                    break;



            }


        }
        leitor.close();

    }
}

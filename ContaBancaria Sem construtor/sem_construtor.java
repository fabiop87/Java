

import java.util.Scanner;

class sem_construtor {
    public static void main(String[] args) {
        int n;
        String t;
        float s;
        int x = 0;
        float valor;
        ContaBanco_s pessoa = new ContaBanco_s();
        Scanner teclado = new Scanner(System.in);
        



        System.out.print("Digite o numero da conta: ");
        n = teclado.nextInt();
        System.out.print("Digite o nome do titular: ");
        t = teclado.next();
        System.out.println("Digite o valor para o depósito inicial, se não quiser depositar digite '0' ");
        s = teclado.nextFloat();

        if(s==0){
            pessoa.AbrirConta(n, t);
        } else{
            pessoa.AbrirConta(n, t, s);
        }





        while (true){

        System.out.println("Escolha a operação: 1-depositar, 2-sacar , 3-mostrar status conta, 4-sair");
        x = teclado.nextInt();
        switch (x) {
            case 1:
               
                System.out.println("Digite o valor a depositar: ");
                valor = teclado.nextFloat();
                pessoa.Depositar(valor);
                break;
            case 2:
            System.out.println("Digite o valor a sacar: ");
            valor = teclado.nextFloat();
            pessoa.Sacar(valor);
                break;
            case 3: 
                pessoa.Status();
                break;
            case 4:
                break;
            default:
                System.out.println("Opção dont existe");
                break;
        }
        if(x == 4){
            break;
        }
    }
    }
}


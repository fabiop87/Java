

import java.util.Scanner;

class usando_construtor {
    public static void main(String[] args) {
        int n;
        String t;
        float s;
        int x = 0;
        float valor;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        n = teclado.nextInt();
        System.out.print("Digite o nome do titular: ");
        t = teclado.next();
        System.out.println("Digite o valor para o depósito inicial, se não quiser depositar digite '0' ");
        s = teclado.nextFloat();
        
        ContaBanco pessoa = new ContaBanco(n, t, s);

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




/*Para abrir uma conta bancaria é necessário informar:

numero da conta
nome do titular da conta
valor de depósito inicial. Este deposito é opcional, a conta poderá ser aberta com saldo inicial zerado.


O número da conta nunca poderá ser alterado,  já o nome do titular pode ser alterado pois uma pessoa pode mudar de nome por ocasião de casamento por exemplo.

O saldo da conta não pode ser alterado livremente, precisa de um mecanismo (método) para proteger isso.
O saldo só aumenta por meio de depósitos, e só diminui por saques.
Para cada saque realizado, o banco cobra uma taxa de R$ 3,00. A conta não pode ficar negativa ou seja, o metodo de saque deve checar isso e não efetuar o mesmo.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não feito um deposito inicial (sobrecarga).
Depois realizar um depósito e um saque sempre mostrando os dados da conta (numero da conta, nome do titular e saldo atual) após cada operação.

*/
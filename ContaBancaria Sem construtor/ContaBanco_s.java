

public class ContaBanco_s {
    public int NumeroConta;
    public String Titular;
    private float Saldo;

    public void AbrirConta(int numeroConta, String titular, float saldo) {
        this.NumeroConta = numeroConta;
        this.Titular = titular;
        this.Saldo = saldo;
    }

    public void AbrirConta(int numeroConta, String titular) {
        this.NumeroConta = numeroConta;
        this.Titular = titular;
        this.Saldo = 0;
    }

    

    public void Status() {
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Titular: " +  this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
    }


    public void Depositar(float v){
        this.setSaldo(this.getSaldo() + (v));
        System.out.println("Depósito de "+ v + " feito na conta " + getNumeroConta() + " do titular: " + getTitular() );
    }

    public void Sacar(float v){
        if(this.getSaldo() >= v){
        this.setSaldo(this.getSaldo() - (v + 3));
        System.out.println("Saque de " + v + " feito na conta " + getNumeroConta() + " do titular: " + getTitular() );
        } else {
            System.out.println("Saldo insuficiente para saque nesse valor");
        }
    }



    //Getters e Setters

    public int getNumeroConta() {
        return this.NumeroConta;
    }
   

    public void setNumeroConta(int numeroConta) {
         NumeroConta = numeroConta;
     }

    public String getTitular() {
        return this.Titular;
    }

    public void setTitular(String titular) {
        this.Titular = titular;
    }

    public float getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(float saldo) {
        this.Saldo = saldo;
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

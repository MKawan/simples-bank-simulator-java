package modules;

public class ContaBankUser {
    
    public String nameUser = "";
    public int conta = 0;
    public String agencia = "";

    double saldo = 0.1;

    public void SaldoAtual(){
        System.out.println("Seu saldo é R$" + saldo);
    }
    public void DepositValue(double deposit){
        saldo = saldo + deposit;
        System.out.println("Seu saldo atual é: R$" + saldo);
    }
    public void SaqueValue(double saque){
        if(saque <= saldo){
            saldo = saldo - saque;
        }else{
            System.out.println("Seu daldo é insuficiente para realizar este saque!");
        }
        System.out.println("Saue realizado com sucesso!\nSeu saldo atual é R$" + saldo);
    }
}

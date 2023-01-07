import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args){
        String nome;
        int numero;
        double saldo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá cliente.");
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o número de sua conta: ");
        numero = sc.nextInt();
        System.out.print("Entre com o valor inicial depositado na conta: ");
        saldo = sc.nextDouble();
        
        Conta minha_conta = new Conta(nome, numero, saldo);
        String pessoa;
        do {
            minha_conta.exibePessoas();
            pessoa = sc.next();
            minha_conta.escolhePessoa(pessoa);
        } while(!pessoa.equals("1") && !pessoa.equals("2"));
        
        String tipo_conta;
        switch(pessoa) {
            case "1":
                PessoaFisica minhaContaFisica = new PessoaFisica(nome, numero, saldo);
                do {
                    minhaContaFisica.exibeContaFisica();
                    tipo_conta = sc.next();
                    minhaContaFisica.escolheContaFisica(tipo_conta);
                } while(!tipo_conta.equals("1") && !tipo_conta.equals("2") && !tipo_conta.equals("3"));
                if(tipo_conta.equals("1") || tipo_conta.equals("2")) {
                    minhaContaFisica.funcionalidades();
                }
                if(tipo_conta.equals("3")) {
                    minhaContaFisica.funcionalidadesInvestimento();
                }
                break;
            case "2":
                PessoaJuridica minhaContaJuridica = new PessoaJuridica(nome, numero, saldo);
                do {
                    minhaContaJuridica.exibeContaJuridica();
                    tipo_conta = sc.next();
                    minhaContaJuridica.escolheContaJuridica(tipo_conta);
                } while(!tipo_conta.equals("1") && !tipo_conta.equals("2"));
                if(tipo_conta.equals("1")) {
                    minhaContaJuridica.funcionalidades();
                }
                if(tipo_conta.equals("2")) {
                    minhaContaJuridica.funcionalidadesInvestimento();
                }
                break;
        }
    }
}

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

        String pessoa;
        do {
            System.out.println("\t Escolha o tipo de pessoa que você deseja entrar como: ");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            pessoa = sc.next();
            switch(pessoa){
                case "1":
                    System.out.print("Você escolheu pessoa física.\n");
                    System.out.println("");
                    break;
                case "2":
                    System.out.print("Você escolheu pessoa jurídica.\n");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println("");
            }
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

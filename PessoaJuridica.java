public class PessoaJuridica extends Conta {
    public PessoaJuridica(String nome, int numero, double saldo){
        super(nome, numero, saldo);
    }


    @Override
    public void sacar(double valor){
        if(getSaldo() >= valor){
            double valor_c_taxa = valor - (valor * 0.005);
            setSaldo(valor_c_taxa);
            System.out.println("Sacado: " + valor_c_taxa + " (Houve 0,5% de taxa)");
            System.out.println("Saldo atual: " + getSaldo() + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    @Override
    public void transferir(double valor){
        int trans_conta;
        if(getSaldo() >= valor){
            System.out.println("Digite o número da conta na qual você deseja transferir: ");
            trans_conta = sc.nextInt();
            double valor_c_taxa = valor - (valor * 0.005);
            setSaldo(valor_c_taxa);
            System.out.println("Foram transferidos " + valor_c_taxa + " para a conta " + trans_conta + " (Houve 0,5% de taxa)");
            System.out.println("Saldo atual: " + getSaldo()+ "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    public void exibeContaJuridica(){
        System.out.println("\t Escolha o tipo de conta que você quer abrir: ");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Investimento");
    }

    public void escolheContaJuridica(String tipo_conta){
        switch(tipo_conta){
            case "1":
                System.out.print("Você escolheu conta corrente.\n");
                System.out.println("");
                break;
            case "2":
                System.out.print("Você escolheu conta investimento.\n");
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida");
                System.out.println("");
        }
    }
    public void funcionalidadesInvestimento() {
        String funcao;
        do {
            exibeMenuInvestimento();
            funcao = sc.next();
            escolheFuncaoInvestimento(funcao);
        } while(!funcao.equals("5"));
    }

    public void escolheFuncaoInvestimento(String funcao){
        double valor;
        switch(funcao){
            case "1":
                investir();
                break;
            case "2":
                System.out.print("Quanto deseja sacar: ");
                valor = sc.nextDouble();
                sacar(valor);
                break;
            case "3":
                System.out.print("Quanto deseja transferir: ");
                valor = sc.nextDouble();
                transferir(valor);
                break;
            case "4":
                extratoInvestimento();
                break;
            case "5":
                System.out.println("Sistema encerrado.");
                break;
            default:
                System.out.println("Opção inválida");
                System.out.println("");
        }
    }
    public void exibeMenuInvestimento(){
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Investir");
        System.out.println("2 - Sacar");
        System.out.println("3 - Transferir");
        System.out.println("4 - Consultar saldo");
        System.out.println("5 - Sair\n");
        System.out.print("Opção: ");
    }
}

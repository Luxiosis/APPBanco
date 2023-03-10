public class PessoaFisica extends Conta {
    public PessoaFisica(String nome, int numero, double saldo){
        super(nome, numero, saldo);
    }

    public void exibeContaFisica(){
        System.out.println("\t Escolha o tipo de conta que você quer abrir:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Conta Investimento");
    }

    public void escolheContaFisica(String tipo_conta){
        switch(tipo_conta){
            case "1":
                System.out.print("Você escolheu conta corrente.\n");
                System.out.println("");
                break;
            case "2":
                System.out.print("Você escolheu conta poupança.\n");
                System.out.println("");
                break;
            case "3":
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
                System.out.print("Quanto deseja investir: ");
                valor = sc.nextDouble();
                investir(valor);
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

public class PessoaJuridica extends Conta {
    public PessoaJuridica(String nome, int numero, double saldo){
        super(nome, numero, saldo);
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
    
    public void funcionalidades() {
        String funcao;
        do {
            exibeMenu();
            funcao = sc.next();
            escolheFuncao(funcao);
        } while(!funcao.equals("5"));
    }
    
    public void funcionalidadesInvestimento() {
        String funcao;
        do {
            exibeMenuInvestimento();
            funcao = sc.next();
            escolheFuncaoInvestimento(funcao);
        } while(!funcao.equals("5"));
    }
    
    public void exibeMenu(){
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Transferir");
        System.out.println("4 - Consultar saldo");
        System.out.println("5 - Sair\n");
        System.out.print("Opção: ");
    }
    
    int incerteza = 0;
    public void escolheFuncao(String funcao){
        double valor;
        switch(funcao){
            case "1":
                System.out.print("Quanto deseja sacar: ");
                valor = sc.nextDouble();
                sacarTaxa(valor);
                break;
            case "2":
                System.out.print("Quanto deseja depositar: ");
                valor = sc.nextDouble();
                depositar(valor);
                break;
            case "3":
                System.out.print("Quanto deseja transferir: ");
                valor = sc.nextDouble();
                transferirTaxa(valor);
                break;
            case "4":
                extrato();
                break;
            case "5": 
                System.out.println("Sistema encerrado.");
                break;
            default:
                System.out.println("Opção inválida");
                System.out.println("");
        }
    }
    
    public void escolheFuncaoInvestimento(String funcao){
        double valor;
        switch(funcao){
            case "1":
                System.out.print("Quanto deseja investir: ");
                valor = sc.nextDouble();
                investirBonus(valor);
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

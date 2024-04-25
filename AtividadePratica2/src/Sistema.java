public class Sistema {

    private static String nome, sabor, tamanho, temperatura;
    private static double preco;

    private static void exibirMenu() {
        System.out.println("\nPASTEL CHÁ E SOBREMESAS");
        System.out.println("1) Registrar novo Chá");
        System.out.println("2) Registrar novo Pastel");
        System.out.println("3) Registrar novo Sobremesa");
        System.out.println("4) Procurar Alimento");
        System.out.println("5) Lista de todos alimentos");
        System.out.println("6) Excluir um alimento");
        System.out.println("7) Excluir todos alimentos");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                registrarCha();
                break;
            case 2:
                registrarPastel();
                break;
            case 3:
                registrarSobremesa();
                break;
            case 4:
                buscarAlimento();
                break;
            case 5:
                listarAlimento();
                break;
            case 6:
                removerAlimento();
                break;           
            case 7:
                removerTodos();
                break;
            
            case 0:
                System.out.println("\n Programa Finalizado :) !");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    private static void registrarCha() {
        System.out.println("\n Novo Chá:");
        System.out.print("\nNome: ");
        nome = Console.lerString();
        System.out.print("\nPreço: ");
        preco = Console.lerDouble();
        System.out.print("\nQuente ou Frio: ");
        temperatura = Console.lerString();

        Cha c = new Cha(nome, preco, temperatura);
        Cadastro.cadastrar(c);
        System.out.println("\nSeu chá foi registrado!");
    }

    private static void registrarSobremesa() {
        System.out.println("\nNova Sobremesa:");
        System.out.print("\nNome: ");
        nome = Console.lerString();
        System.out.print("\nPreço: ");
        preco = Console.lerDouble();
        System.out.print("\nTamanho da sobremesa: (Pequena - Média - Grande");
        tamanho = Console.lerString();

        Sobremesa s = new Sobremesa(nome, preco, tamanho);
        Cadastro.cadastrar(s);
        System.out.println("\nSobremesa cadastrada com sucesso!");
    }

    private static void registrarPastel() {
        System.out.println("\nNovo Pastel:");
        System.out.print("Nome: ");
        nome = Console.lerString();
        System.out.print("Preço:");
        preco = Console.lerDouble();
        System.out.print("Sabor: ");
        sabor = Console.lerString();

        Pastel p = new Pastel(nome, preco, sabor);
        Cadastro.cadastrar(p);
        System.out.println("\nNovo pastel registrado!");
    }

    private static void buscarAlimento() {
        System.out.println("\nBuscar Alimento:");
        System.out.print("\nNome: ");
        nome = Console.lerString();

        Alimento a = Cadastro.buscar(nome);

        if (a != null) {
            System.out.println("\nAlimento encontrado!:");
            System.out.println(a.toString());
        } else {
            System.out.println("\nNão encontramos o alimento:  " + nome);
        }
    }

    private static void listarAlimento() {
        System.out.println("\nEsses são todos os alimentos cadastrados:");

        if (Cadastro.getListaAlimento().isEmpty()) {
            System.out.println("\nVish... estamos sem alimentos");
            return;
        }

        for (Alimento temp : Cadastro.getListaAlimento()) {
            System.out.println(temp.toString());
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }
    
    public static void removerAlimento() {
        System.out.print("\nDigite o nome do alimento a ser removido: ");
        nome = Console.lerString();
        Alimento a = Cadastro.buscar(nome);
        if (a != null) {
            Cadastro.getListaAlimento().remove(a);
            System.out.println("\nAlimento " + nome + " encontrado e excluido!:");
        } else {
            System.out.println("\nNão encontramos o alimento:  " + nome);
        }
    }

    public static void removerTodos() {
        Cadastro.getListaAlimento().clear();
        System.out.println("Todos alimentos foram removidos com sucesso :) !");
    }

}
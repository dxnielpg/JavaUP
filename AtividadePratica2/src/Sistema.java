public class Sistema {

        private static void exibirMenu() {
    
            System.out.println("\nPASTEL CHÁ E SOBREMESAS");
            System.out.println("1) Registrar novo Chá");
            System.out.println("2) Registrar novo Pastel");
            System.out.println("3) Registrar novo Sobremesa");
            System.out.println("4) Procurar Alimento");
            System.out.println("5) Lista de todos alimentos");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
    
        }
    
        private static void verificarOpcao(int op) {
            String nome;
            double preco;
    
            switch (op) {
                case 1:
    
                RegistrarCha();
    
                    break;
    
                case 2:
    
                RegistrarChaPastel();
    
                    break;
    
                case 3:
    
                RegistrarSobremesa();
    
                    break;
    
                case 4:
    
                    BuscarAlimento();
    
                    break;
    
                case 5:
    
                    ListarAlimento();
    
                    break;
    
                case 0:
    
                    System.out.println("\nFinalizado :) !");
                    break;
    
                default:
    
                    System.out.println("\nOpção inválida. Digite novamente.");
                    break;
            }
    
        }
    
        private static void RegistrarCha(){
            System.out.println("\n Novo Chá:");
                    
                    System.out.print("Nome: ");
                    nome = Console.lerString();
                    
                    System.out.print("Preço: ");
                    preco = Console.lerDouble();
                    
                    System.out.print("Quente ou Frio: ");
                    temperatura = Console.lerString();
    
                    Cha c = new Cha();
    
                    Cadastro.cadastrar(c);
    
                    System.out.println("\nSeu chá foi registrado!");
    
                    break;
        }
    
    
        private static void RegistrarSobremesa(){
            System.out.println("\nNova Sobremesa:");
                    
                    System.out.print("Nome: ");
                    nome = Console.lerString();
                    
                    System.out.print("Preço: ");
                    preco = Console.lerDouble();
    
                    System.out.println("Sabor: ");
                    sabor = Console.lerString();
                    
                    Sobremesa s = new Sobremesa();
                    System.out.print("Tipo de sobremesa: (Bolo, Brigadeiro...)");
                    tipo = Console.lerString();
    
                    Cadastro.cadastrar(g);
    
                    System.out.println("\nGerente cadastrado com sucesso!");
        }
    
        private static void RegistrarPastel(){
    
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
    
        private static BuscarAlimento(){
            System.out.println("\nBuscar Alimento:");
    
                    System.out.print("Nome: ");
                    getNome = Console.lerString();
    
                    Alimento a = Cadastro.buscar(alimento);
    
                    if (f != null) {
    
                        System.out.println("\nAlimento encontrado!:");
                        System.out.println(f.toString());
                        return;
    
                    }
    
                    System.out.println("\nNão encontramos o alimento:  " + nome);
    
        }
    
        private static  ListarAlimento(){
            System.out.println("\nEsses são todos os alimentos cadastrados: :");
    
                    if (Cadastro.getListaAlimento().size() == 0) {
    
                        System.out.println("\nVish... estamos sem alimentos");
                        return;
    
                    }
    
                    for (Alimento temp : Cadastro.getListaAlimento()) {
    
                        System.out.println(temp.toString());
    
                    }
        }
    
        private static  void executar() {
    
            int op;
            do {
    
                exibirMenu();
                op = Console.lerInt();
                verificarOpcao(op);
    
            } while (op != 0);
    }
    
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class InterfaceUsuario  {
    private Cadastro cadastro;

    public InterfaceUsuario(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Remover pessoa");
            System.out.println("3. Buscar pessoa");
            System.out.println("4. Listar pessoas");
            System.out.println("5. Sair");
            System.out.print("Digite a opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número inteiro.");
                scanner.next();
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar pessoa
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
                    String dataNascimentoString = scanner.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataNascimento = null;
                    try {
                        dataNascimento = sdf.parse(dataNascimentoString);
                    } catch (ParseException e) {
                        System.out.println("Data inválida. Digite no formato dd/MM/yyyy.");}
                    System.out.println("Digite Seu CPF: : ");
                    String CPF = scanner.nextLine();
                    System.out.println("Digite Seu Endereco");
                    String endereco = scanner.nextLine();

                    // ... coletar os demais dados (data de nascimento, CPF, endereço) ...
                    Pessoa novaPessoa = new Pessoa(nome,dataNascimento,CPF,endereco);
                    cadastro.adicionarPessoa(novaPessoa);
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;
                case 2:
                    // Remover pessoa
                    System.out.print("Digite o CPF da pessoa a ser removida: ");
                    String cpfParaRemover = scanner.next();
                    CPF cpf = new CPF(cpfParaRemover);
                    if (cadastro.removerPessoa(cpf)) {
                        System.out.println("Pessoa removida com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 3:
                    // Buscar pessoa
                    System.out.print("Digite o CPF da pessoa a ser buscada: ");
                    cpfParaRemover = scanner.next();
                    cpf = new CPF(cpfParaRemover);
                    Pessoa pessoaEncontrada = cadastro.buscarPessoa(cpf);
                    if (pessoaEncontrada != null) {
                        System.out.println("Pessoa encontrada: " + pessoaEncontrada);
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 4:
                    // Listar pessoas
                    cadastro.listarPessoas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}
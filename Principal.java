import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(cadastro);

        // Carregar cadastro de um arquivo (se existir)
        try {
            cadastro.carregarCadastro("cadastro.dat");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar o cadastro: " + e.getClass());
        }

        interfaceUsuario.menu();

        // Salvar cadastro em um arquivo ao finalizar
        try {
            cadastro.salvarCadastro("cadastro.dat");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o cadastro: " + e.getClass());
        }
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.List;


    class Cadastro {
        private List<Pessoa> pessoas = new ArrayList<>();

        public void adicionarPessoa(Pessoa pessoa) {
            pessoas.add(pessoa);
        }

        public boolean removerPessoa(CPF cpf) {
            return pessoas.removeIf(p -> p.getCpf().equals(cpf));
        }

        public Pessoa buscarPessoa(CPF cpf) {
            return pessoas.stream()
                    .filter(p -> p.getCpf().equals(cpf))
                    .findFirst()
                    .orElse(null);
        }

        public void listarPessoas() {
            pessoas.forEach(System.out::println);
        }
        // Salva o cadastro em um arquivo
        public void salvarCadastro(String nomeArquivo) throws IOException {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
                oos.writeObject(pessoas);

            }
        }

        // Carrega o cadastro de um arquivo
        public void carregarCadastro(String nomeArquivo) throws IOException, ClassNotFoundException {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo)))
            {pessoas = (List<Pessoa>) ois.readObject();}
        }
    }


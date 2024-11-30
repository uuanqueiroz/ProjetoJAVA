Explixando o projeto
<img width="1440" alt="Captura de Tela 2024-11-29 às 20 12 15" src="https://github.com/user-attachments/assets/037755f0-be59-4d72-b43b-df3839f635ad">
Na classe Principal temos o main do projeto, onde é ela que se da o run da aplicaçao e ele me retorna um menu com as opceos 
1 . Adicionar pessoa, 2 . Remover Pessoa, 3. Buscar Pessoa, 4. Listar Pessoas e 5. Sair como vimos na imagem. 

Explicando agora as classes: 
Começando por Pessoa: 
<img width="1440" alt="Captura de Tela 2024-11-29 às 21 42 43" src="https://github.com/user-attachments/assets/3dacc946-f596-4ad3-9c01-aca33ca957e3">
Nela eu fiz a classe com nome Pessoa que possui os atributos: Nome, Data de Nascimento, Cpf, e Endereço. todos sao privados com getter e setter e constructor da classe. 
Classe Endereço: 
<img width="1440" alt="Captura de Tela 2024-11-29 às 21 45 00" src="https://github.com/user-attachments/assets/3a3f366f-f5af-41ce-bd72-76a23949b714">
com atributos de : rua, bairro, cidade, estado e cep, tambem com metodos privados exigindo os getters e setters do mesmo para serem acessados e tambem com constructor da classe. 
As classes data e cpf seguem mesmo rumo. 
.
Já a classe Interface do Usuario. lá onde fica a construção do menu que será apresentado ao usuario. 

<img width="1440" alt="Captura de Tela 2024-11-29 às 23 34 15" src="https://github.com/user-attachments/assets/dbc9957a-d813-47c5-a2ac-5e1141220285">


a estrutura dele é simples, existem 5 opcoes, o usuario escolhe uma e segue com o processo.
obs: na parte de data eu apanhei para usar o parse. 
tem a construcao do: adicionar, remover, buscar, listar e sair. 
Já na classe Cadastro, é la onde eu faco a <List> para pessoas in Pessoa. 
E lá tambem onde fiz os crustrutores para remover o user pelo index no cpf, onde existe o construtor do metodo de listar, de salvar o contato em um arquivo e o de carregar um arquivo ja salvo.
como eu pinei para usar um sgbd com questoes de drive, eu resolvi ir para esse metodo para salvar dados. 

O codigo possui alguns defeitos, com o tempo acredito que posso melhora-lo. !

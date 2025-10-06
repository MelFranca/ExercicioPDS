Documentação do Sistema de Animais de Estimação (Pet System)
1. Introdução
O projeto 'Petshop’ simula um sistema básico de gerenciamento de animais de estimação, seus donos e interações com uma clínica veterinária. O objetivo é demonstrar conceitos fundamentais da Programação Orientada a Objetos (POO), como encapsulamento, composição e interação entre classes.
2. Estrutura do Projeto
Pacote principal: Petshop

O projeto contém cinco classes principais, cada uma responsável por uma parte específica do sistema:
- Animal
- Dono
- DoutorVet
- Consulta
- Sistema
3. Classe Animal
Arquivo: Animal.java
A classe Animal representa um animal de estimação. Contém atributos básicos como nome e tipo, além de métodos que simulam ações comuns de um animal.
Atributos:
- nome: String — Nome do animal.
- tipo: String — Espécie ou tipo do animal (ex: cachorro, gato, etc).
Métodos:
- fazerSom(): exibe uma mensagem indicando que o animal está fazendo som.
- comer(): exibe uma mensagem indicando que o animal está comendo.
- dormir(): exibe uma mensagem indicando que o animal está dormindo.
4. Classe Dono
Arquivo: Dono.java
A classe Dono representa o tutor de um animal. É responsável por interagir com o objeto Animal, realizando ações como chamar, alimentar e levar ao veterinário.
Atributos:
- nome: String — Nome do dono.
Métodos:
- chamarAnimal(Animal animal): chama o animal pelo nome.
- alimentarAnimal(Animal animal): alimenta o animal e chama o método comer().
- levarAoVeterinario(Animal animal): exibe mensagem indicando que o animal será levado ao veterinário.
5. Classe DoutorVet
Arquivo: DoutorVet.java
A classe DoutorVet representa um profissional que cuida dos animais. É usada na classe Consulta para examinar, vacinar e dar alta aos animais.
Atributos:
- nome: String — Nome do DoutorVet.
Métodos:
- examinar(Animal animal): exibe mensagem de exame do animal.
- vacinar(Animal animal): exibe mensagem de vacinação do animal.
- darAlta(Animal animal): indica que o animal recebeu alta.
6. Classe Consulta
Arquivo: Consulta.java
A classe Consulta representa uma consulta veterinária, conectando um Animal e um Veterinario. Permite simular o processo de atendimento, da entrada até a alta.
Atributos:
- animal: Animal — Referência ao animal atendido.
- doutorVet: DoutorVet — Referência ao veterinário responsável.
Métodos:
- iniciar(): inicia a consulta e chama o método examinar().
- aplicarVacina(): aplica a vacina no animal.
- finalizar(): encerra a consulta, chamando o método darAlta().
7. Classe Sistema
Arquivo: Sistema.java
A classe Sistema contém o método main, responsável por executar o programa e demonstrar a interação entre os objetos criados. Também possui métodos auxiliares para inicializar e encerrar o sistema.
Métodos:
- main(String[] args): método principal que executa o sistema de exemplo.
- iniciarSistema(): exibe mensagem de início do sistema.
- mostrarMensagem(): exibe mensagem de boas-vindas.
- encerrarSistema(): exibe mensagem de encerramento do sistema.
8. Conclusão
O projeto 'Petshop’ é uma introdução prática à Programação Orientada a Objetos, demonstrando como criar e integrar classes com responsabilidades específicas. Através da simulação de interações entre animais, donos e veterinários, o sistema reforça conceitos como encapsulamento, composição e cooperação entre objetos.

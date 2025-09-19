### Sobre o Projeto

Este projeto é um **Web Service RESTful** para um sistema de e-commerce. Ele foi desenvolvido com **Spring Boot 3**, usando o **Spring Data JPA** e **Hibernate** para gerenciar o banco de dados.

O objetivo principal foi aplicar os conceitos de **orientação a objetos** e **arquitetura de software**, incluindo:
* **Modelagem de domínio** para representar as entidades do negócio (produtos, usuários, pedidos).
* **Separação de responsabilidades** em camadas: `resources` (endpoints REST), `services` (lógica de negócio) e `repositories` (acesso a dados).
* **Tratamento de exceções personalizadas** para um controle de erros robusto.
* Uso de **enums** para garantir a integridade de dados (ex: status do pedido).
* Relacionamentos entre entidades gerenciados pelo próprio JPA.

### Tecnologias Utilizadas

* **Java 21+**
* **Spring Boot 3.x**
* **Spring Data JPA**
* **Hibernate**
* **Maven** para gerenciamento de dependências
* **H2 Database** (banco de dados em memória)

---

### Como Executar

1.  **Pré-requisitos:** Certifique-se de ter o **JDK 21** e o **Maven** instalados.
2.  **Execute a aplicação** usando o Maven:
    `mvn spring-boot:run`.
    A aplicação será iniciada na porta padrão `8080`, e o banco de dados H2 será populado com os dados de exemplo.

---

### API Endpoints

Todos os endpoints e exemplos de requisições estão disponíveis em uma **collection do Insomnia**, localizada na pasta \`docs/spring-ws.yaml\`.

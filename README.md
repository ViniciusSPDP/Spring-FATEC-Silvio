# Sistema Fatec Web

Este é um projeto de sistema web desenvolvido com Spring Boot para o gerenciamento de alunos e cursos, como parte de um trabalho para a FATEC.

## Tecnologias Utilizadas

- **Backend:** Java 21, Spring Boot 3
- **Persistência de Dados:** Spring Data JPA (Hibernate)
- **Banco de Dados:** PostgreSQL
- **Frontend:** Thymeleaf, HTML5, CSS3
- **Build:** Apache Maven
- **Utilitários:** Lombok

---

## Pré-requisitos

Antes de começar, certifique-se de que você tem os seguintes softwares instalados em sua máquina:

- [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21) ou superior.
- [Apache Maven](https://maven.apache.org/download.cgi) (Opcional, pois o projeto inclui o Maven Wrapper).
- [PostgreSQL](https://www.postgresql.org/download/) (Banco de Dados).

---

## Configuração do Ambiente Local

Siga os passos abaixo para configurar e executar o projeto em seu ambiente de desenvolvimento.

### 1. Clone o Repositório

```bash
git clone https://github.com/ViniciusSPDP/Spring-FATEC-Silvio.git
cd websystem
```

### 2. Configure o Banco de Dados

1.  Certifique-se de que o seu servidor PostgreSQL está em execução.
2.  Crie um novo banco de dados com o nome `fatecwebsystem`.

    ```sql
    CREATE DATABASE fatecwebsystem;
    ```

### 3. Crie o Arquivo `application.properties`

Na pasta `src/main/resources/`, crie um arquivo chamado `application.properties`. Copie e cole o conteúdo abaixo, **lembrando de alterar o usuário e a senha do seu banco de dados**.

```properties
# Nome da aplicação
spring.application.name=websystem

# Porta em que a aplicação será executada
server.port=8082

# --- Configuração do Banco de Dados (PostgreSQL) ---
# URL de conexão JDBC.
# Altere 'seu_usuario' e 'sua_senha' para suas credenciais do PostgreSQL.
spring.datasource.url=jdbc:postgresql://localhost:5432/fatecwebsystem
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# --- Configurações do JPA/Hibernate ---
# 'update': O Hibernate tentará atualizar o esquema do banco de dados automaticamente
# com base nas suas entidades (@Entity) ao iniciar a aplicação. Ideal para desenvolvimento.
spring.jpa.hibernate.ddl-auto=update

# 'true': Exibe no console as queries SQL geradas pelo Hibernate. Muito útil para depuração.
spring.jpa.show-sql=true

# 'false': Mantém o SQL exibido em uma única linha. Se 'true', o SQL será formatado.
spring.jpa.properties.hibernate.format_sql=false

# --- Configurações do Thymeleaf (Desenvolvimento) ---
# 'false': Desabilita o cache dos templates Thymeleaf. Permite ver alterações nos HTML sem reiniciar.
spring.thymeleaf.cache=false
```

---

## Executando a Aplicação

Use o Maven Wrapper incluído no projeto para executar a aplicação.

- No Windows (usando PowerShell ou CMD):
  ```bash
  ./mvnw.cmd spring-boot:run
  ```
- No Linux ou macOS:
  ```bash
  ./mvnw spring-boot:run
  ```

Após a inicialização, a aplicação estará disponível no seu navegador no seguinte endereço:

http://localhost:8082
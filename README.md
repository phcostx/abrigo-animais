
# Abrigo de Animais

Este projeto é uma **API RESTful** desenvolvida com **Spring Boot** que permite o gerenciamento de um abrigo de animais, onde você pode realizar operações como **criar**, **atualizar**, **deletar** e **consultar** informações sobre os pets.

## Funcionalidades

A API permite as seguintes operações:

- **Cadastrar um pet** (POST): Adicionar um novo pet ao abrigo.
- **Consultar todos os pets** (GET): Listar todos os pets cadastrados no abrigo.
- **Consultar um pet específico** (GET): Obter detalhes de um pet específico pelo seu ID.
- **Atualizar um pet** (PUT): Atualizar as informações de um pet existente.
- **Excluir um pet** (DELETE): Deletar um pet do abrigo.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 2.7.x**
- **JPA (Hibernate)**
- **Banco de dados H2** (ou outro banco de dados de sua escolha)
- **RESTful API**
- **Maven** para gerenciamento de dependências

## Como Rodar o Projeto

### Pré-requisitos

Antes de começar, você precisa ter as seguintes ferramentas instaladas:

- **Java 17** ou superior
- **Maven** para gerenciar as dependências
- **IDE** (como IntelliJ IDEA, Eclipse ou VSCode) para editar o código

### Passos para executar:

1. Clone o repositório:

   ```bash
   git clone https://github.com/phcostx/abrigo-animais.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd abrigo-animais
   ```

3. Compile e execute o projeto com o Maven:

   ```bash
   mvn spring-boot:run
   ```

4. A aplicação estará rodando em `http://localhost:8080`.

## Endpoints

Aqui estão os endpoints disponíveis para a interação com a API:

- **POST** `/api/pets`: Cria um novo pet no abrigo.
- **GET** `/api/pets`: Retorna todos os pets cadastrados.
- **GET** `/api/pets/{id}`: Retorna as informações de um pet específico.
- **PUT** `/api/pets/{id}`: Atualiza as informações de um pet existente.
- **DELETE** `/api/pets/{id}`: Exclui um pet do abrigo.

### Exemplo de requisição:

**POST /api/pets** - Criar um pet

```json
{
  "nome": "Rex",
  "idade": 2,
  "raca": "Vira-lata",
  "sexo": "Macho"
}
```

**Resposta esperada:**

```json
{
  "id": 1,
  "nome": "Rex",
  "idade": 2,
  "raca": "Vira-lata",
  "sexo": "Macho"
}
```

## Contribuindo

Se você quiser contribuir para este projeto, siga os seguintes passos:

1. Faça um fork do repositório.
2. Crie uma branch para a sua feature (`git checkout -b feature/novo-recurso`).
3. Faça suas alterações e commit (`git commit -m 'Adicionando novo recurso'`).
4. Envie a branch para o repositório remoto (`git push origin feature/novo-recurso`).
5. Abra um Pull Request para a branch `main`.

## Licença

Distribuído sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

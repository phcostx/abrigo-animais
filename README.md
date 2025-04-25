
# Abrigo de Pets 🐶🐱

Este projeto é uma **API RESTful** desenvolvida com **Spring Boot** que permite o gerenciamento de um abrigo de animais, onde você pode realizar operações como **criar**, **atualizar**, **deletar** e **consultar** informações sobre os pets.

# Objetivo 🔍

O principal objetivo deste projeto é registrar minha evolução nos estudos em Java, Spring Boot, Docker e outras tecnologias que forem sendo incorporadas ao longo do tempo.

## Funcionalidades 

A API permite as seguintes operações:

- **Cadastrar um pet** (POST): Adicionar um novo pet ao abrigo.
- **Consultar todos os pets** (GET): Listar todos os pets cadastrados no abrigo.
- **Consultar um pet específico** (GET): Obter detalhes de um pet específico pelo seu ID.
- **Atualizar um pet** (PUT): Atualizar as informações de um pet existente.
- **Excluir um pet** (DELETE): Deletar um pet do abrigo.

## Tecnologias Utilizadas 

- **Java 17**
- **Spring Boot 3.4.5**
- **JPA (Hibernate)**
- **Banco de dados PostgreSQL** 
- **RESTful API**
- **Maven** para gerenciamento de dependências
- **Docker** 

## Como Rodar o Projeto

### Pré-requisitos 🚀

Antes de começar, você precisa ter as seguintes ferramentas instaladas:

- **Java 17**
- **Maven** para gerenciar as dependências
- **Docker** se for usar a versão containerizada

### Rodando o Projeto com Docker
Caso prefira rodar o projeto em um container Docker, siga as etapas abaixo:

1. Clone o repositório:

   ```bash
   git clone https://github.com/phcostx/abrigo-pets.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd abrigo-pets
   ```

3. Construa a imagem Docker:

   ```bash
   docker build -t abrigo-pets
   ```

4. A aplicação estará rodando em `http://localhost:8080`.



### Passos para executar o projeto localmente:

1. Clone o repositório:

   ```bash
   git clone https://github.com/phcostx/abrigo-pets.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd abrigo-pets
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

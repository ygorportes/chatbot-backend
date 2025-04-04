
# Chatbot Backend 🤖

Este é o backend de um chatbot voltado para suporte TEF, desenvolvido em Spring Boot. O sistema processa perguntas dos usuários e responde com base em um conjunto predefinido de respostas armazenadas em um arquivo JSON.


## Instalação

Clone o repositório:

```bash
  git clone https://github.com/ygorportes/chatbot-backend
```

Entre no diretório do projeto:

```bash
  cd chatbot-backend
```
    
## Executando o projeto

Compile e execute o projeto:

```bash
  mvn spring-boot:run
```


## Documentação da API

### Rota: Enviar mensagem ao chatbot
`
  POST /api/chat
`

Parametros:

| Body | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `message` | `string` | Mensagem do usuário. |

#### Exemplo de Requisição:

```json
{
    "message" : "Mensagem do usuário."
}
```

#### Exemplo de Resposta:

```json
{
    "response": "Resposta do Bot."
}
```



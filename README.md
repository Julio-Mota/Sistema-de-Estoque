## Sistema de Controle de Estoque

### By: Júlio Mota

Sistema de controle de estoque desenvolvido em Spring Boot, com cadastro de produtos e registro de entradas com atualização automática de saldo. Saída de estoque e relatórios estão em desenvolvimento.

### Tecnologias utilizadas

- Java 25
- Spring Boot 4
- Spring Data JPA / Hibernate
- Bean Validation
- PostgreSQL
- Docker / Docker Compose
- Lombok
- Maven


### Instruções para testar este código:

1. Instale o Docker Desktop em https://www.docker.com/products/docker-desktop/ e abra-o para entrar em execução. Instale também o WSL se usar Windows.

2. Baixe este projeto na sua máquina clonando pelo GitHub e adicione em algum lugar de sua preferência.

3. Dentro da sua IDE de preferência, abra o projeto onde você o clonou e acesse o arquivo ".env.example", copie ele, cole no mesmo lugar e renomeie para apenas ".env".

4. Dentro do ".env" defina o usuário e senha que o PostgreSQL terá. Se desejar troque os outros campos para a sua escolha.

5. Execute no terminal da sua IDE o comando "docker compose up --build" para o Docker instalar tudo que for necessário e inclusive criar o banco de dados chamado 'estoque'.

6. Escolha a forma de testar APIs de sua preferência (Postman, Thunder Client, Swagger, etc.).

7. No seu navegador, digite na barra de endereço http://localhost:8081/produtos ou a rota que você escolheu e aperte Enter.

8. Escolhendo a opção POST na sua ferramenta, escolha também a opção de informação em JSON.

9. Em "JSON Content", insira:

```json
{
  "nome": "Mouse"
}
```
(ou o valor que quiser dentro das aspas)

10. Aperte no botão de enviar ('Send'). Se tudo ocorrer bem, você verá Status 200 e a seguinte resposta:

```json
{
  "id": 1,
  "nome": "Mouse",
  "ativo": true,
  "saldo": 0
}
```


Parabéns! Você executou a aplicação com êxito.


### Licença

Este projeto está sob a licença MIT — veja o arquivo [LICENSE](LICENSE) para mais detalhes.
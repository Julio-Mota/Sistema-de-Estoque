By: Júlio Mota


Instruções para rodar este código:

1. Instale o VS Code, Java, PostgreSQL e o Maven.

2. Instale as extensões do VS Code: "Extension Pack for Java", "Java", "Spring Boot Extension Pack" e o "Thunder Client".

3. Vá em script.sql acessando estoque >> target >> sql e copie o código que está dentro deste arquivo.

4. Acesse o PostgreSQL, depois em Servers >> PostgreSQL.

5. Aperte com botão direito em Databases, depois em Query tool e cole oque copiou, depois aperte F5 em seu teclado para dar Play.

6. Vá em application.properties acessando estoque >> src >> main >> resources.

7. Em "spring.datasource.username=" colado com o símbolo de '=' coloque o usuário do seu PostgreSQL que geralmente é 'postgres' e depois em "spring.datasource.password=" colado com o símbolo de '=' coloque a senha que você definiu para seu PostgreSQL.

8. Aperte no botão de Play do seu VS Code dentro da classe 'EstoqueApplication.java'.

9. No seu navegador de preferência digite na barra de endereço http://localhost:8080/produtos e entre (apenas isso, vai aparecer uma tela de "erro" que é comum e faz parte do processo).

10. Vá no Thunder Client (símbolo de um raio na barra lateral esquerda do seu VS Code) e aperte em New Request.

11. Aperte em GET e selecione POST ao abrir a caixa de escolha, e ao lado em "Enter url" escreva http://localhost:8080/produtos.

12. Mais abaixo aperte em 'Body', e mais abaixo escolha a opção JSON.

13. Em JSON Content digite: {
                              "nome": "Mouse"
                            }.

14. Aperte no botão azul 'Send'. Tudo estando certo, ao lado aparecerá Status 200 (então está okay) e abaixo aparecerá: {
                                                                                                                          "id": 1,
                                                                                                                          "nome": "Mouse",
                                                                                                                          "ativo": true,
                                                                                                                          "saldo": 0
                                                                                                                        }.


Parabéns! Você executou corretamente a aplicação e viu que está funcionando corretamente.
By: Júlio Mota


Instruções para testar este código:

1. Instale este projeto pelo GitHub e descompacte em algum lugar de sua preferência no seu diretório.

2. Instale o VS Code, Java(25 ou +), PostgreSQL(18 ou +) e o Maven(3.9.15 ou +).

3. Instale as extensões do VS Code: "Extension Pack for Java", "Java", "Spring Boot Extension Pack" e o "Thunder Client".

4. Vá em script.sql acessando 'estoque >> target >> sql' e copie o código que está dentro deste arquivo.

5. Acesse o PostgreSQL, e dentro dele acesse 'Servers >> PostgreSQL'.

6. Aperte com botão direito em Databases, depois em Query tool e cole oque copiou, depois aperte F5 em seu teclado para dar Play.

7. Vá em application.properties acessando 'estoque >> src >> main >> resources'.

8. Em "spring.datasource.username=" colado com o símbolo de '=' coloque o usuário do seu PostgreSQL que geralmente é 'postgres' e depois em "spring.datasource.password=" colado com o símbolo de '=' coloque a senha que você definiu para seu PostgreSQL.

9. Aperte no botão de Play do seu VS Code dentro da classe 'EstoqueApplication.java'.

10. No seu navegador de preferência digite na barra de endereço http://localhost:8080/produtos e entre (apenas isso, vai aparecer uma tela de "erro" que é comum e faz parte do processo).

11. Vá no Thunder Client (símbolo de um raio na barra lateral esquerda do seu VS Code) e aperte em New Request.

12. Aperte em GET e selecione POST ao abrir a caixa de escolha, e ao lado em "Enter url" escreva http://localhost:8080/produtos.

13. Mais abaixo aperte em 'Body', e mais abaixo escolha a opção JSON.

14. Em JSON Content digite: {
                              "nome": "Mouse" (ou oque quiser dentro das aspas)
                            }.

15. Aperte no botão azul 'Send'. Tudo estando certo, ao lado aparecerá Status 200 (então está okay) e abaixo aparecerá: {
                                                                                                                          "id": 1,
                                                                                                                          "nome": "Mouse",
                                                                                                                          "ativo": true,
                                                                                                                          "saldo": 0
                                                                                                                        }.


Parabéns! Você executou corretamente a aplicação e viu que está funcionando corretamente.

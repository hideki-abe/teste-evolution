# teste-evolution
API com as entidades Pessoa e Contato para um teste de uma vaga de estágio. </br>
Ferramentas utilizadas: **SpringBoot** com **Maven**, utilizando o banco de dados **PostgreSQL**. Para os testes das requisições, o **Postman** foi utilizado.

A api foi feita utilizando o modelo <a href="https://github.com/hideki-abe/teste-evolution/blob/master/anexos/sql.sql">sql</a> e os relacionamentos foram introduzidos com o JPA.

## Endpoints: 

### Métodos GET, POST E PUT
localhost:8090/pessoas para o CRUD da entidade Pessoa </br>
localhost:8090/contatos para o CRUD da entidade Contato </br>

### Metodos DELETE
localhost:8090/pessoas/1?idpessoas=1 para excluir pelo id = 1, por exemplo </br>
localhost:8090/contatos?id=1 (NÃO ESTÁ FUNCIONANDO)

Para as funções de fatorial e remover letras duplicadas, foi criada uma classe contendo as duas funções. Não foram realizados testes pelo console, mas foram feitos testes unitários para cada função, utiilizando o JUnit 4. 

**Exemplo de JSON utilizado para a requisicao POST**
<img src="https://github.com/hideki-abe/teste-evolution/blob/master/anexos/post.JPG"/>

**Exemplo de JSON utilizado para a requisicao PUT (update)**
<img src="https://github.com/hideki-abe/teste-evolution/blob/master/anexos/put.JPG"/>

**Exemplo de JSON obtido ao realizar GET**
<img src="https://github.com/hideki-abe/teste-evolution/blob/master/anexos/get.JPG"/>

**Notas:** Eu não consegui integrar o Swagger com o SpringBoot, aparentemente o Swagger ainda não está funcionando com a versão 3.0.0 do Spring. 

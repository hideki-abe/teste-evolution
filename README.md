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

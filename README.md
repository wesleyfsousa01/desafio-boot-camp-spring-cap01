# Descrição:

  O projeto consiste em um **CRUD** completo de Web services **REST** para acessar um recurso de clientes, contendo as cinco operações
  básicas:
* Buca paginada de recursos
* Busca de recurso por Id
* Inserir novo recurso
* Atualizar novo recurso
* Deletar recurso

### tecnologias:

* Java 17
* Spring Boot 3.1
* H2 Database
  
### Modelo:

![modelo](https://github.com/wesleyfsousa01/desafio-boot-camp-spring-cap01/blob/master/assets/modelo.png)

### Endpoints:

* Busca paginada de clientes

GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

![busca paginada](https://github.com/wesleyfsousa01/desafio-boot-camp-spring-cap01/blob/master/assets/recurso_busca_paginada.png)

* Busca de cliente por id:
  
GET /clients/1

![busca por id](https://github.com/wesleyfsousa01/desafio-boot-camp-spring-cap01/blob/master/assets/recurso_busca_por_id.png)

* Inserção de novo cliente
  
POST /clients

![inserir cliente](https://github.com/wesleyfsousa01/desafio-boot-camp-spring-cap01/blob/master/assets/recurso_inserir.png)

* Atualização de cliente
  
PUT /clients/1

![atualizar cliente](https://github.com/wesleyfsousa01/desafio-boot-camp-spring-cap01/blob/master/assets/recurso_atualizar.png)

* Deleção de cliente

DELETE /clients/1

![deletar cliente](https://github.com/wesleyfsousa01/desafio-boot-camp-spring-cap01/blob/master/assets/recurso_deletar.png)
![nao econtrado](https://github.com/wesleyfsousa01/desafio-boot-camp-spring-cap01/blob/master/assets/nao_encontrado.png)

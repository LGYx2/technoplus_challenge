
# RESTful API
RESTful API que nos permite gerenciar informações de servicos basicos de cambio.

* Possível adicionar moeda com respectiva taxa de conversao;
* Possível listar todas moedas na base de dados com respectivas taxas de conversao;
* Possível modificar os dados das moedas;
* Possível excluir uma moeda e sua taxa de conversao criada anteriormente;

# Tecnologias usadas
* API desenvolvida em Java 17 usando Spring Boot Framework no VSCodium
* API criada usando a ferramenta de gerenciamento de dependências Maven
* O banco de dados H2 foi utilizado para armazenar as informações, para acessar o console: http://localhost:8083/h2-console
* A inicialização do banco de dados pode ser encontrada no arquivo https://github.com/LGYx2/technoplus_challenge/blob/main/src/main/resources/data.sql
* Testado no Postman com todas as instruções funcionando.

# Acesso e teste
* Os arquivos de controle, modelo, serviço e repositório estão localizados no diretório https://github.com/LGYx2/technoplus_challenge/tree/main/src/main/java/com/servicocambios/cambio
* Para adicionar uma moeda: http://localhost:8083/add-currency-rate (método POST)
* Para listar moedas: http://localhost:8083/list-currency-rates (método GET)
* Para modificar os dados de uma moeda e sua taxa criada anteriormente: http://localhost:8083/update-currency-rate/{id} (método PUT)
* Para excluir uma moeda e taxa de conversao criada anteriormente: http://localhost:8083/delete-currency-rate/{id} (método DELETE)
* Para  procurar uma moeda e sua taxa de conversao especifica: http://localhost:8083/find-currency-rate/{id} (Get Method)

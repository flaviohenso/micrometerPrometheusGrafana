<p><a target="_blank" href="https://app.eraser.io/workspace/7e9J9bsiE4eX9JBQM5MO" id="edit-in-eraser-github-link"><img alt="Edit in Eraser" src="https://firebasestorage.googleapis.com/v0/b/second-petal-295822.appspot.com/o/images%2Fgithub%2FOpen%20in%20Eraser.svg?alt=media&amp;token=968381c8-a7e7-472a-8ed6-4a6626da5501"></a></p>

# Demo Micrometer Project
Este projeto é um exemplo de uma aplicação Spring Boot com um controlador simples para listar produtos.
Objetivo principal é demonstrar a utilização do Micrometer para monitoramento de métricas da aplicação e a integração com o Prometheus e Grafana.

## Requisitos
- Java 21 ou superior
- Maven 3.6.3 ou superior
## Configuração
1. Clone o repositório:git clone <URL_DO_REPOSITORIO>
cd <NOME_DO_REPOSITORIO>
2. Compile o projeto:mvn clean install
3. Execute a aplicação:mvn spring-boot:run
## Endpoints
### Listar Produtos
- **URL:** `/produtos` 
- **Método:** `GET` 
- **Resposta:** `200 OK` 
- **Descrição:** Retorna uma lista de produtos mockados.
```json
[
    {
        "id": 1,
        "nome": "Produto 1",
        "preco": 10.0
    },
    {
        "id": 2,
        "nome": "Produto 2",
        "preco": 20.0
    },
    {
        "id": 3,
        "nome": "Produto 3",
        "preco": 30.0
    }
]


```
## Configuração Docker


Link importante para configurar o micrometer e grafana:

https://tjf.totvs.com.br/docs/monitoramento-estatisticas

https://medium.com/@habbema/grafana-integra%C3%A7%C3%A3o-com-o-prometheus-a6ae8200e485#:~:text=No%20painel%20do%20Grafana%2C%20v%C3%A1,endere%C3%A7o%20do%20servidor%20do%20Prometheus.

docker run -d --name=grafana -p 3000:3000 grafana/grafana





<!--- Eraser file: https://app.eraser.io/workspace/7e9J9bsiE4eX9JBQM5MO --->
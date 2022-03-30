# microservices-springcloud

## 💬 Projeto

Construindo um ecossistema com arquitetura baseada em microsserviços usando spring cloud.

## Arquitetura padrão X Arquitetura de micro-serviços
<img src=".github/fluxo-mocroservices.png" alt="img-microservice"/>

- Todas as camadas separadas em micro-serviços
- Responsabilidades mais definidas
- 'Pedaços' do software independentes
- Camada UI (interface) atua como monolito

## 🛠️ Tecnologias utilizadas

- JAVA
- Spring Cloud
- Spring Data Elasticsearch
- API REST
- Gradle

### microsserviços 1 - Product-Catalog

> Consome os dados do Elasticsearch.

### Config Server (Spring Cloud Config)

> Gerenciar as configurações dos microsserviços. 

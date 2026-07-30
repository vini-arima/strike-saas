# Striker - Gateway de Pagamento

Um gateway de pagamentos desenvolvido para integrar sistemas com diferentes meios de pagamento.

## Tecnologias 

Frontend: Html , Css ,Js 

Backend: Java 21 , Spring Boot , Spring Web , Spring JDBC , Maven

Banco de Dados: MySQL

## Requisitos

### Funcionais 
-  O sistema deve permitir o cadastro de clientes.
-  O sistema deve permitir consultar clientes cadastrados.
-  O sistema deve permitir processar pagamentos.
-  O sistema deve permitir consultar pagamentos.
-  O sistema deve armazenar o histórico de pagamentos.

### Não Funcionais

- cadastro de cliente deve ser persistido em um banco de dados MySQL
- cadastro de cliente deve validar e-mail.
- processamento de pagamento deve aceitar apenas duas opções PIX ou Cartão.
- sistema deve ser organizado em arquitetura em camadas.

## Frontend 

```
gateway/
├── frontend/
│   ├── css/
│   │   └── style.css
│   │
│   ├── img-front/
│   │   └── striker.png
│   │
│   ├── js/
│   │   ├── api.js
│   │   ├── consult.js
│   │   ├── customer.js
│   │   └── payment.js
│   │
│   ├── consult.html
│   ├── customer.html
│   ├── index.html
│   └── payment.html
│
├── LICENSE
└── README.md
```
## Backend 
Futuramente irei implementar

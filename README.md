# Sistema de Controle de Estoque

## Contexto
Este projeto consiste no desenvolvimento de um sistema de controle de estoque para uma empresa de comércio.

O controle de estoque é essencial para que a empresa consiga gerenciar seus produtos, acompanhar quantidades disponíveis e planejar reposições. Um sistema automatizado permite reduzir erros e melhorar a eficiência na gestão.

---

## Objetivo
Desenvolver um sistema capaz de:
- Gerenciar produtos e categorias
- Controlar entradas e saídas de estoque
- Atualizar automaticamente as quantidades
- Gerar relatórios para apoio à tomada de decisão

---

## Funcionalidades

### Produtos
- Cadastro de produtos (CRUD)
- Alteração, consulta e exclusão
- Controle de quantidade em estoque

### Categorias
- Cadastro de categorias
- Organização dos produtos

### Movimentação
- Entrada de produtos (adição ao estoque)
- Saída de produtos (remoção do estoque)
- Registro de data e quantidade
- Alertas de estoque mínimo e máximo

### Relatórios
- Lista de preços
- Balanço físico/financeiro
- Produtos abaixo do estoque mínimo
- Quantidade de produtos por categoria
- Produtos com maior entrada e saída

---

# Requisitos Funcionais

## Produtos
- RF01: O sistema deve permitir cadastrar produtos.
- RF02: O sistema deve permitir editar produtos.
- RF03: O sistema deve permitir excluir produtos.
- RF04: O sistema deve permitir listar produtos cadastrados.

## Categorias
- RF05: O sistema deve permitir cadastrar categorias.
- RF06: O sistema deve permitir editar categorias.
- RF07: O sistema deve permitir excluir categorias.
- RF08: O sistema deve permitir listar categorias cadastradas.

## Movimentações
- RF09: O sistema deve permitir registrar entrada de produtos.
- RF10: O sistema deve permitir registrar saída de produtos.
- RF11: O sistema deve atualizar automaticamente o estoque após movimentações.
- RF12: O sistema deve avisar quando o produto estiver abaixo da quantidade mínima.
- RF13: O sistema deve avisar quando o produto ultrapassar a quantidade máxima.

## Relatórios
- RF14: O sistema deve gerar relatório de lista de preços.
- RF15: O sistema deve gerar relatório de balanço físico/financeiro.
- RF16: O sistema deve gerar relatório de produtos abaixo da quantidade mínima.
- RF17: O sistema deve gerar relatório de produtos por categoria.
- RF18: O sistema deve gerar relatório de produtos com maior entrada e saída.

# Requisitos Não Funcionais

- RNF01: O sistema deve ser desenvolvido em Java.
- RNF02: O sistema deve utilizar banco de dados MySQL.
- RNF03: O sistema deve possuir interface gráfica utilizando Java Swing.
- RNF04: O projeto deve utilizar GitHub para controle de versão.
- RNF05: O código-fonte deve seguir padronização e organização.
- RNF06: O sistema deve permitir desenvolvimento colaborativo entre os integrantes.

---

## Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|---------|
| Java | 25.0.2 |
| Apache NetBeans IDE | 29 |
| Java Swing | Biblioteca gráfica |
| MySQL | 8.0 |
| MySQL Connector/J (JDBC) | 8.0.33 |
| Git | Controle de versão |
| GitHub | Hospedagem do repositório |

---

## Estrutura do Projeto
O projeto segue uma arquitetura organizada em camadas:

- Model → Classes de entidades  
- DAO → Acesso ao banco de dados  
- View → Interface com o usuário  
- Main → Execução do sistema  

---

## Equipe
Projeto desenvolvido por:

- Deise Cristine Souza Soares – RA: 10726111459 – GitHub: https://github.com/dcristine-ss  
- Juan Andre Latronico – RA: 1072619446 – GitHub: https://github.com/yTwooh  
- Matheus de Oliveira Stupp – RA: 1072617227 – GitHub: https://github.com/eustuppmatheus  
- Sara Luana Garcia – RA: 10725213821 – GitHub: https://github.com/saragarccia  
- Victoria Danielly Pires – RA: 10725213823 – GitHub: https://github.com/viicpirexx18-dev  

---

## Conclusão
O sistema desenvolvido permite um controle eficiente do estoque, auxiliando na organização dos produtos e na tomada de decisões. Com isso, é possível melhorar a gestão e evitar problemas como falta ou excesso de produtos.
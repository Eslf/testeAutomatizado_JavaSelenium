Feature: Preciso adicionar um item ao carrinho e confirmar se ele foi adicionado com sucesso

Scenario: Adicionar o primeiro produto da pesquisa 'caneta bic' ao carrinho de compras

Given Clicado no primeiro produto da lista
When E adicionado o produto ao carrinho de compras
Then E exibida a lista de produtos no carrinho
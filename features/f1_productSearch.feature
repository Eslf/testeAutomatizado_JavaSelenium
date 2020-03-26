Feature: Preciso pesquisar por uma caneta bic e receber uma lista com os resultados da pesquisa

Scenario: Pesquisar pelo produto 'caneta bic'

Given Acessada a pagina do Submarino
When Pesquisado no campo de busca por caneta bic
Then O site retorna o resultado da pesquisa

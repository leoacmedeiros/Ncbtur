#language: pt
@InativarProduto
Funcionalidade: InativarProduto

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Inativar Produto
    Dado que acesse o modulo de Produto para vizualizar um Produto
    Quando buscar pelo Produto
      | nome | Executivo Duplo  |
    E inativar o Produto buscado
    Então o produto será inativado

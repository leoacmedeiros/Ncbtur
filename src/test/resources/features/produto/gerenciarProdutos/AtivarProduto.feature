#language: pt
@AtivarProduto
Funcionalidade: AtivarProduto

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Inativar Produto
    Dado que acesse o modulo de Produto para vizualizar um Produto
    Quando buscar pelo Produto
      | nome | Produto criado pela automação |
    E ativar o Produto buscado
    Então o produto será ativado

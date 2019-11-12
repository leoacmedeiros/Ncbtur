#language: pt
@VisualizarProduto
Funcionalidade: VisualizarProduto

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Produto
    Dado que acesse o modulo de Produto para vizualizar um Produto
    Quando buscar pelo Produto
      | nome | Executivo Duplo |
    E visualzar o Produto buscado
    Então será apresentado os dados do Produto

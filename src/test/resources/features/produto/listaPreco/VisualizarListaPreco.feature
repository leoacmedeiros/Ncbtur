#language: pt
@VisualizarListaDePreco
Funcionalidade: VisualizarListaDePreco

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Lista de Preço
    Dado que acesse o modulo de Produto para visualizar uma Lista de Preço
    Quando buscar pela Lista de Preço
      | situacao | Ativo |
    E Visualizar a Lista de Preço
    Então será apresentado a Lista de Preço

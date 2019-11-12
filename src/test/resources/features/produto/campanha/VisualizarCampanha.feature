#language: pt
@VisualizarCampanha
Funcionalidade: VisualizarCampanha

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Produto
    Dado que acesse o modulo de Produto para visualizar uma Campanha
    Quando buscar pela Campanha
      | nome | Adesão única |
    E visualzar o Campanda buscada
    Então será apresentado os dados da Campanha

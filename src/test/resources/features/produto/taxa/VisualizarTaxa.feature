#language: pt
@VisualizarTaxa
Funcionalidade: Visualizar Taxa

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Taxa
    Dado que acesse o modulo de Produto para visualizar Taxas
    Quando buscar pela Taxa
      | codigo   |                            |
      | nome     | Taxa criada pela automação |
      | tipo     |                            |
      | situacao | Ativo                      |
    E visualizar
    Então apresentado os dados da taxa

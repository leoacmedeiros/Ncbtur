#language: pt
@InativarCampanha
Funcionalidade: InativarCampanha

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Inativar Produto
    Dado que acesse o modulo de Produto para inativar uma Campanha
    Quando buscar pela Campanha
      | nome | CAMPANHA KENE MARIA |
    E inativar a Campanha buscada
    Então a Campanha será inativada

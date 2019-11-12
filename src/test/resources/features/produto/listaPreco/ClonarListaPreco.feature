#language: pt
@ClonarListaDePreco
Funcionalidade: ClonarListaDePreco

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Clonar Lista de Preço
    Dado que acesse o modulo de Produto para clonar uma Lista de Preço
    Quando buscar pela Lista de Preço
      | situacao | Ativo |
    E Clonar a Lista de Preço
    E definir uma nova data inicial
      | data inicio | 02/10/2019 |
    Quando salvar a Lista de Preço
    Então será criada a Lista de Preço

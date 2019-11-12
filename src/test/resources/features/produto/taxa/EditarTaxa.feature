#language: pt
@EditarTaxa
Funcionalidade: Editar Taxa

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Editar Taxa
    Dado que acesse o modulo de Produto para visualizar Taxas
    Quando buscar pela Taxa
      | codigo   |                            |
      | nome     | Taxa criada pela automação |
      | tipo     |                            |
      | situacao | Ativo                      |
    E editar a Taxa desejada
      | tipo              | Adesão                                  |
      | nome              | Taxa criada pela automação              |
      | comissao          | Não                                     |
      | desconto campanha | Sim                                     |
      | desconto convenio | Não                                     |
      | descricao         | Descrição da Taxa criada pela automação |
      | situacao          | Ativo                                   |
    E salvar os dados do formulario
    Então será criada a Taxa

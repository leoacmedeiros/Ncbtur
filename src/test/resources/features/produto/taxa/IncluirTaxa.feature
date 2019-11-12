#language: pt
@InlcuirTaxa
Funcionalidade: Incluir Taxa

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Taxa
    Dado que acesse o modulo de Produto para visualizar Taxas
    E crie a Taxa
    Quando preencher o formulário
      | tipo              | Manutenção         |
      | nome              | Taxa de Manutenção |
      | comissao          | Não                |
      | desconto campanha | Não                |
      | desconto convenio | Não                |
      | descricao         | Taxa de Manutenção |
      | situacao          | Ativo              |
    E salvar os dados do formulario
    Então será criada a Taxa

#language: pt
@IncluirProduto
Funcionalidade: IncluirProduto

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Produto Tipo VENDA
    Dado que acesse o modulo de Produto para vizualizar um Produto
    E crie um Produto
    E preencha o formulario para produto do Tipo VENDA
      | nome                         | Superior Triplo     |
      | tipo                         | Venda               |
      | diarias                      |                   7 |
      | parcelas                     |                  12 |
      | nivel                        | Superior            |
      | categoria                    | Triplo              |
      | descricao                    | Superior Triplo     |
      | situacao                     | Ativo               |
      | periodo                      |                  12 |
      | feriado prolongado           | Não                 |
      | alta temporada               | Não                 |
      | despesas adicionais          | Sim                 |
      | tipo cobranca                | Despesas adicionais |
      | virada periodo               | Sim                 |
      | carencia                     | Não                 |
      | taxa manutencao adesao       |                     |
      | taxa manutencao tranferencia |                     |
    Quando salvar os dados do Produto
    Então será criado o Produto

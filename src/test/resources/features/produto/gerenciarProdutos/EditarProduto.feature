#language: pt
@EditarProduto
Funcionalidade: EditarProduto

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Editar Produto tipo VENDA
    Dado que acesse o modulo de Produto para vizualizar um Produto
    Quando buscar pelo Produto
      | nome | Executivo Duplo Automação |
    E editar o produto
      | nome                         | Executivo Duplo Automação                        |
      | tipo                         | Venda                                            |
      | diarias                      |                                                7 |
      | parcelas                     |                                               12 |
      | nivel                        | Executivo                                        |
      | categoria                    | Duplo                                            |
      | descricao                    | Descrição do produto venda criado pela automação |
      | situacao                     | Ativo                                            |
      | periodo                      |                                               12 |
      | feriado prolongado           | Não                                              |
      | alta temporada               | Não                                              |
      | despesas adicionais          | Sim                                              |
      | tipo cobranca                |                                                  |
      | virada periodo               | Sim                                              |
      | carencia                     | Sim                                              |
      | taxa manutencao adesao       |                                                2 |
      | taxa manutencao tranferencia |                                                1 |
    Quando salvar os dados do Produto
    Então o Produto será editado

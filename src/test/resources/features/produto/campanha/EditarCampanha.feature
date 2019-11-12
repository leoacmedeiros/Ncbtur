#language: pt
@EditarCampanha
Funcionalidade: EditarCampanha

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Editar Campanha
    Dado que acesse o modulo de Produto para editar uma Campanha
    Quando buscar pela Campanha
      | nome | Adesão única |
    E editar os dados da CAMPANHA Dados básicos
      | codigo     |                                                     |
      | nome       | Adesão única automação EDITADO                      |
      | tipo       | Venda                                               |
      | descricao  | Venda de títulos Bancorbras EDITADO                 |
      | situacao   | Ativa                                               |
      | restricoes | Restrição da Campanha criada pela automação EDITADO |
    Então avançar
    Quando editar os dados da VIGÊNCIA Duração
      | tipo de vigencia    | Período definido |
      | tempo inderteminado | Sim              |
      | data inicio         | 07/10/2019       |
      | data fim            |                  |
    Então avançar
    Quando editar os dados dos PRODUTOS Itens vinculados
      | produtos | Todos |
    Então avançar
    Quando editar os dados das TAXAS e descontos
      | taxa     |  |
      | desconto |  |
    Então avançar
    Quando editar os dados dos CANAIS DE VENDA e abrangência
      | canais de venda | Todos |
      | abrangencia     | Todos |
    E salvar os dados editados da Campanha
    Então será editada a Campanha

#language: pt
@IncluirCampanha
Funcionalidade: IncluirCampanha

  Contexto: Como usuário desejo me autenticar no sistema
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Campanha
    Dado que acesse o modulo de Produto para criar uma nova Campanha
    E crie a Campanha
    Quando preencher o formulário CAMPANHA Dados básicos
      | codigo     |                                             |
      | nome       | Adesão única automação                      |
      | tipo       | Venda                                       |
      | descricao  | Venda de títulos Bancorbras                 |
      | situacao   | Ativa                                       |
      | restricoes | Restrição da Campanha criada pela automação |
    Então avançar
    Quando preencher o formulário VIGÊNCIA Duração
      | tipo de vigencia    | Período definido |
      | tempo inderteminado | Sim              |
      | data inicio         | 07/10/2019       |
      | data fim            |                  |
    Então avançar
    Quando preencher o formulário PRODUTOS Itens vinculados
      | produto | Todos |
    Então avançar
    Quando preencher o formulário TAXAS e descontos
      | taxa     |  |
      | desconto |  |
    Então avançar
    Quando preencher o formulário CANAIS DE VENDA e abrangência
      | canais de venda | Todos |
      | abrangencia     | Todos |
    E salvar os dados da Campanha
    Então será criada a Campanha

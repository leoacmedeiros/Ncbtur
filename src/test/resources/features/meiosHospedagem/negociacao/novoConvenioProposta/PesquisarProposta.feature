#language: pt
@PesquisarProposta
Funcionalidade: PesquisarProposta

  Contexto: Como usuário desejo pesquisar Proposta
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Pesquisar Proposta por Código da Proposta, Código do Meio de Hospedagem e por Nome do Meio de Hospedagem
    Dado que acesse o menu Novo Convênio Proposta
    Quando buscar pelo Código da Proposta
    |Cod. Proposta				|12															|    
    Então deverá exibir o Código da Proposta pesquisado
    Quando buscar pelo Código do Meio de Hospedagem
    |Cod. Meio Hospedagem	|1314														|
    Então deverá exibir o Código do Meio de Hospedagem pesquisado
    Quando a busca for realizada pelo Nome do Meio de Hospedagem 
    |Nome									|HOTEL POUSADA VILLA DO CERRADO	|
    Então deverá exibir o Nome

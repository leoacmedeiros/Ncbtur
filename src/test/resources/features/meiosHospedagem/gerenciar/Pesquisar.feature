#language: pt
@Pesquisar
Funcionalidade: PesquisarMeioHospedagem

  Contexto: Como usuário desejo pesquisar meio de hospedagem
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Pesquisar Meios de hospedagem por código e por nome
    Dado que acesse o modulo de Meios de Hospedagem
    Quando buscar pelo codigo
      | codigoMeioHospedagem | 1342 |
    Então deverá exibir o código pesquisado 
    Quando buscar pelo Nome do Meio de Hospedagem
      | nomeMeioHospedagem | MACHADINHO TERMAS PARK HOTEL |
    Então deverá exibir o Nome do Meio de Hospedagem pesquisado  

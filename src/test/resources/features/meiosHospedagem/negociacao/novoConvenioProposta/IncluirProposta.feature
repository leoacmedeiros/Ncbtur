#language: pt
@IncluirProposta
Funcionalidade: IncluirProposta

  Contexto: Como usuário desejo incluir uma Nova Proposta
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Nova Proposta
    Dado que acesse o módulo de Meios de Hospedagem
    E acesse o menu Novo convênio
    E clique no botão Nova Proposta
    E preencha todos os campos
      | CNPJ                       | Gerado pela função de gerar CNPJ  |
      | Nome                       | HOTEL POUSADA VILLA DO CERRADO    |
      | Razão Social               | Villa do Cerrado LTDA             |
      | Email                      | villacerrado@gmail.com            |
      | Site                       | www.villacerrado.com.br           |
      | Telefone                   |                       61995989344 |
      | Inscrição Municipal        |                           1234567 |
      | Inscrição Estadual         |                           9987654 |
      | Rede                       | Nova Rede de Hotel Espirito Santo |
      | Taxa ISS                   |                                10 |
      | Tipo de Meio de Hospedagem | Hotel                             |
      | Tipo de Administração      | Própria                           |
      | Nome Cont. Comercial       | Henrique Fontenelle Gonçalves     |
      | Email Cont Comercial       | henriquefonteleles@gmail.com      |
      | Telefone Cont. Comercial   |                       61985735122 |
      | CEP Endereço               |                          71070501 |
      | CEP Correspondência        |                          72006290 |
    Quando clicar no botão de Salvar Meio de Hospedagem
    Então o sistema irá incluir os dados informados

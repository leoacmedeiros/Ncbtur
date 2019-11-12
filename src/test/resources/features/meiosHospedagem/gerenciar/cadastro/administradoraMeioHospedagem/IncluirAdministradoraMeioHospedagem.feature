#language: pt
@IncluirAdministradoraMeioHospedagem
Funcionalidade: IncluirAdministradoraMeioHospedagem

  Contexto: Como usuário desejo incluir uma nova administradora de meio de hospedagem
    Dado que eu acesse o sistema CBTUR
    Então deverá exibir a tela inicial do sistema

  Cenário: Incluir Administradora de Meio de Hospedagem
    Dado que acesse o Menu Meios de Hospedagem
    E acesse o Menu Administradora de Meio de Hospedagem
    E clique no botao de Nova Administradora de Meios de Hospedagem
    Quando preencher todos os campos com dados validos
    |Nome									|Nova Administradora Teste Auto 1	|
    |CNPJ									|92188177000181										|
    |Razão Social					|Razão Social Teste Auto 1				|
    |CEP									|72115095													|
    |Nome-Cont. Comerc.		|Novo Nome Teste Auto 1						|
    |E-mail-Cont. Comerc. |emailTeste@gmail.com							|
    |Telefone-Cont. Comerc|61999999999											|
    E clicar no botao Salvar Administradora de Meios de Hospedagem
    Então o sistema ira incluir uma nova Administradora de Meios de Hospedagem com os dados inseridos